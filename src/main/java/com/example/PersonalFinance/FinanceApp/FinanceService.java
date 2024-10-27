package com.example.PersonalFinance.FinanceApp;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class FinanceService
{
    private final TransactionRepository transactionRepository;
    private final UserRepository userRepository;

    public FinanceService(TransactionRepository transactionRepository, UserRepository userRepository)
    {
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
    }

    public List<Transaction> findAll()
    {
        return transactionRepository.findAll();
    }

    public Transaction saveTransaction(Transaction transaction)
    {
        return transactionRepository.save(transaction);
    }

    public void deleteTransactionById(Long id)
    {
        transactionRepository.deleteById(id);
    }

    public Transaction findById(Long id)
    {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if (transaction.isEmpty())
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found");
        }
        return transaction.get();
    }

    public User registerUser(User user)
    {
        if(userRepository.existsByEmail(user.getEmail()))
        {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User registered with this email already exists");
        }
        return userRepository.save(user);
    }

    public User findUserByUsername(String username)
    {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }
}

package com.example.PersonalFinance.FinanceApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class FinanceService
{
    private final FinanceRepository financeRepository;

    public FinanceService(FinanceRepository financeRepository)
    {
        this.financeRepository = financeRepository;
    }

    public List<Transaction> findAll()
    {
        return financeRepository.findAll();
    }

    public Transaction saveTransaction(Transaction transaction)
    {
        return financeRepository.save(transaction);
    }

    public void deleteTransactionById(Long id)
    {
        financeRepository.deleteById(id);
    }

    public Transaction findById(Long id)
    {
        Optional<Transaction> transaction = financeRepository.findById(id);
        if (transaction.isEmpty())
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found");
        }
        return transaction.get();
    }
}

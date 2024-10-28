package com.example.PersonalFinance.FinanceApp.Finance;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/finance")
public class FinanceController
{
    private final FinanceService financeService;

    public FinanceController(FinanceService financeService)
    {
        this.financeService = financeService;
    }

    @GetMapping("/transactions")
    public List<Transaction> findAllTransactions()
    {
        return financeService.findAllTransactions();
    }

    @GetMapping("/transactions/{id}")
    public Transaction findTransactionById(@PathVariable Long id)
    {
        return financeService.findTransactionById(id);
    }

    @PostMapping("/transactions")
    public Transaction saveTransaction(@RequestBody Transaction transaction)
    {
        return financeService.saveTransaction(transaction);
    }

    @DeleteMapping("/transactions/{id}")
    public void deleteTransactionById(@PathVariable Long id)
    {
        financeService.deleteTransactionById(id);
    }

    @GetMapping("/users")
    public List<User> findAllUsers()
    {
        return financeService.findAllUsers();
    }
    @GetMapping("/users/{username}")
    public User findUserById(@PathVariable String username)
    {
        return financeService.findUserByUsername(username);
    }

    @PostMapping("/users")
    public User registerUser(@RequestBody User user)
    {
        return financeService.registerUser(user);
    }

    @Transactional
    @DeleteMapping("/users/{email}")
    public void deleteUserByEmail(@PathVariable String email)
    {
        financeService.deleteUserByEmail(email);
    }

}

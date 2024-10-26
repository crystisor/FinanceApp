package com.example.PersonalFinance.FinanceApp;

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

    @GetMapping
    public List<Transaction> findAll()
    {
        return financeService.findAll();
    }

    @GetMapping("/{id}")
    public Transaction findById(@PathVariable Long id)
    {
        return financeService.findById(id);
    }

    @PostMapping("/add")
    public Transaction saveTransaction(@RequestBody Transaction transaction)
    {
        return financeService.saveTransaction(transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        financeService.deleteTransactionById(id);
    }
}

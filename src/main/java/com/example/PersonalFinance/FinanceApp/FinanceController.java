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

    @PostMapping("/add")
    public Transaction saveTransaction(@RequestBody Transaction transaction)
    {
        return financeService.saveTransaction(transaction);
    }
}

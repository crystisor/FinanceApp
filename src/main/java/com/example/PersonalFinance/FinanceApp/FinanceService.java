package com.example.PersonalFinance.FinanceApp;

import org.springframework.stereotype.Service;

import java.util.List;

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
}

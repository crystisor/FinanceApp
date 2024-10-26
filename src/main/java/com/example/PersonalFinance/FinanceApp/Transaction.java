package com.example.PersonalFinance.FinanceApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public record Transaction(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
        Long userId,
        String type,
        Double amount,
        LocalDate date,
        String description
) {
}

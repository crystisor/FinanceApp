package com.example.PersonalFinance.FinanceApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public record User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
        String username,
        String email,
        String password,
        LocalDate createdDate
) {
}
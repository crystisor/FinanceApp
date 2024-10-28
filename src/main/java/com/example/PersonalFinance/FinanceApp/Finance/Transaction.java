package com.example.PersonalFinance.FinanceApp.Finance;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")  // Adjusted to lowercase
public class Transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Long userId;
        private String type;
        private Double amount;
        private LocalDate date;
        private String description;

        public Transaction(Long userId, String type, Double amount, LocalDate date, String description)
        {
                this.userId = userId;
                this.type = type;
                this.amount = amount;
                this.date = date;
                this.description = description;
        }

        public Transaction(){}

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public Long getUserId() { return userId; }
        public void setUserId(Long userId) { this.userId = userId; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public Double getAmount() { return amount; }
        public void setAmount(Double amount) { this.amount = amount; }

        public LocalDate getDate() { return date; }
        public void setDate(LocalDate date) { this.date = date; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
}

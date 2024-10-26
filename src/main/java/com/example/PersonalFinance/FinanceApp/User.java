package com.example.PersonalFinance.FinanceApp;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "app_user") // Avoids potential issues with "user" as a reserved word
public class User
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true) // Ensure usernames are unique
        private String username;

        @Column(nullable = false, unique = true) // Ensure emails are unique
        private String email;

        @Column(nullable = false) // Password should not be null
        private String password;

        @Column(name = "created_date", nullable = false) // Specify column name and non-null constraint
        private LocalDate createdDate;

        // No-arg constructor required by JPA
        public User()
        {}

        // All-args constructor
        public User(String username, String email, String password, LocalDate createdDate)
        {
                this.username = username;
                this.email = email;
                this.password = password;
                this.createdDate = createdDate;
        }

        // Getters and setters for all fields
        public Long getId()
        {
                return id;
        }

        public void setId(Long id)
        {
                this.id = id;
        }

        public String getUsername()
        {
                return username;
        }

        public void setUsername(String username)
        {
                this.username = username;
        }

        public String getEmail()
        {
                return email;
        }

        public void setEmail(String email)
        {
                this.email = email;
        }

        public String getPassword()
        {
                return password;
        }

        public void setPassword(String password)
        {
                this.password = password;
        }

        public LocalDate getCreatedDate()
        {
                return createdDate;
        }

        public void setCreatedDate(LocalDate createdDate)
        {
                this.createdDate = createdDate;
        }
}

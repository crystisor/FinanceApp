package com.example.PersonalFinance.FinanceApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends JpaRepository<Transaction, Long>
{

}

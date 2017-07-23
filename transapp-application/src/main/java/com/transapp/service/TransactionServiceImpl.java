package com.transapp.service;

import com.transapp.domain.Transaction;
import com.transapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImpl implements TransactionService
{
  @Autowired
  private TransactionRepository transactionRepository;

  @Override
  public void saveTransaction(Transaction transaction)
  {
    transactionRepository.saveTransaction(transaction);
    System.out.println("Transaction saved");
  }
}

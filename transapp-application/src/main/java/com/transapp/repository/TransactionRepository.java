package com.transapp.repository;

import com.transapp.domain.Transaction;

public interface TransactionRepository
{
  void saveTransaction(Transaction transaction);
}

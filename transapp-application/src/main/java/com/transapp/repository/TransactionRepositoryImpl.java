package com.transapp.repository;

import com.transapp.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class TransactionRepositoryImpl implements TransactionRepository
{
  @Autowired
  JdbcTemplate jdbcTemplate;

  public void saveTransaction(Transaction transaction) {
    jdbcTemplate.execute("INSERT INTO TRANSACTIONS VALUES ('" +
      transaction.getUuid().toString() + "', " +
      transaction.getTimestamp() + ", " +
      transaction.getAmount() + ");"
    );
  }

}

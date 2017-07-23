package com.transapp.mapper;

import com.transapp.domain.Transaction;
import com.transapp.dto.CreateTransactionRequestDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TransactionMapperImpl implements TransactionMapper
{
  @Override
  public Transaction convertoToDomainObject(CreateTransactionRequestDto createTransactionRequestDto)
  {
    Transaction transaction = new Transaction();
    transaction.setUuid(UUID.randomUUID());
    transaction.setAmount(createTransactionRequestDto.getAmount());
    transaction.setTimestamp(createTransactionRequestDto.getTimestamp());
    return transaction;
  }
}

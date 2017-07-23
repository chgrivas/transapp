package com.transapp.mapper;

import com.transapp.domain.Transaction;
import com.transapp.dto.CreateTransactionRequestDto;

public interface TransactionMapper
{
  Transaction convertoToDomainObject(CreateTransactionRequestDto createTransactionRequestDto);
}

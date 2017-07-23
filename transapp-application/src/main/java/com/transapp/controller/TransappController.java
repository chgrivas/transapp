package com.transapp.controller;

import com.transapp.api.TransappApi;
import com.transapp.dto.CreateTransactionRequestDto;
import com.transapp.dto.GetStatisticsResponseDto;
import com.transapp.mapper.StatisticsMapper;
import com.transapp.mapper.TransactionMapper;
import com.transapp.service.StatisticsService;
import com.transapp.service.TransactionService;
import com.transapp.validator.CreateTransactionRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransappController implements TransappApi
{

  @Autowired
  private TransactionService transactionService;

  @Autowired
  private StatisticsService statisticsService;

  @Autowired
  private CreateTransactionRequestValidator createTransactionRequestValidator;

  @Autowired
  private TransactionMapper transactionMapper;

  @Autowired
  private StatisticsMapper statisticsMapper;

	@Override
	public ResponseEntity createTransaction(@RequestBody CreateTransactionRequestDto createTransactionRequestDto) {
	  if (!createTransactionRequestValidator.isValid(createTransactionRequestDto)) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    transactionService.saveTransaction(transactionMapper.convertoToDomainObject(createTransactionRequestDto));

	  return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}

  @Override
  public GetStatisticsResponseDto getStatistics() {
	  return statisticsMapper.convertToResponseDto(statisticsService.getLastSixtySecondsStatistics());
  }

}

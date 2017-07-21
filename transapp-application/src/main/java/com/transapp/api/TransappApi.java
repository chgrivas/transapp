package com.transapp.api;

import com.transapp.dto.CreateTransactionRequestDto;
import com.transapp.dto.CreateTransactionResponseDto;
import com.transapp.dto.GetStatisticsResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TransappApi {

	@RequestMapping(method = RequestMethod.POST, value = "/transactions")
	CreateTransactionResponseDto createTransaction(CreateTransactionRequestDto createTransactionsRequestDto);

	@RequestMapping(method = RequestMethod.GET, value = "/statistics")
	GetStatisticsResponseDto getStatistics();
}

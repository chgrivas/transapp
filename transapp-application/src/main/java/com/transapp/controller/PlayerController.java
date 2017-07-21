package com.transapp.controller;

import java.util.UUID;

import com.transapp.api.TransappApi;
import com.transapp.dto.CreateTransactionRequestDto;
import com.transapp.dto.CreateTransactionResponseDto;
import com.transapp.dto.GetStatisticsResponseDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController implements TransappApi
{

	@Override
	public CreateTransactionResponseDto createTransaction(@RequestBody CreateTransactionRequestDto createTransactionRequestDto) {
    System.out.println("heeree");
    return null;
	}

  @Override
  public GetStatisticsResponseDto getStatistics() {
    System.out.println("here");
    return null;
  }

}

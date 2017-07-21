package com.transapp.controller;

import com.transapp.api.TransappApi;
import com.transapp.dto.CreateTransactionRequestDto;
import com.transapp.dto.GetStatisticsResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController implements TransappApi
{

	@Override
	public ResponseEntity createTransaction(@RequestBody CreateTransactionRequestDto createTransactionRequestDto) {
    System.out.println(createTransactionRequestDto.getAmount());
    System.out.println(createTransactionRequestDto.getTimestamp());

    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
//    return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}

  @Override
  public GetStatisticsResponseDto getStatistics() {
    System.out.println("here");
    return null;
  }

}

package com.transapp.validator;

import com.transapp.dto.CreateTransactionRequestDto;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class CreateTransactionRequestValidator implements Validator<CreateTransactionRequestDto>
{

  private static final long SIXTY_SECONDS_IN_MILLIS = 60000;

  @Override
  public boolean isValid(CreateTransactionRequestDto createTransactionRequestDto)
  {
    return Instant.now().minusMillis(createTransactionRequestDto.getTimestamp()).toEpochMilli() <= SIXTY_SECONDS_IN_MILLIS;
  }
}

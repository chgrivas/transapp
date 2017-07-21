package com.transapp.dto;

import java.math.BigDecimal;

public class CreateTransactionRequestDto {

	private BigDecimal amount;
	private long timestamp;

  public BigDecimal getAmount()
  {

    return amount;
  }

  public void setAmount(BigDecimal amount)
  {
    this.amount = amount;
  }

  public long getTimestamp()
  {
    return timestamp;
  }

  public void setTimestamp(long timestamp)
  {
    this.timestamp = timestamp;
  }
}

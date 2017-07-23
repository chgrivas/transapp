package com.transapp.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class Transaction
{
  private UUID uuid;
  private long timestamp;
  private BigDecimal amount;

  public void setUuid(UUID uuid)
  {
    this.uuid = uuid;
  }

  public UUID getUuid()
  {
    return uuid;
  }

  public long getTimestamp()
  {
    return timestamp;
  }

  public void setTimestamp(long timestamp)
  {
    this.timestamp = timestamp;
  }

  public BigDecimal getAmount()
  {
    return amount;
  }

  public void setAmount(BigDecimal amount)
  {
    this.amount = amount;
  }
}

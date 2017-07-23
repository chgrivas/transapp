package com.transapp.dto;

import java.math.BigDecimal;

public class GetStatisticsResponseDto {

    private BigDecimal sum;
    private BigDecimal max;
    private BigDecimal min;
    private BigDecimal avg;
    private int count;

    public BigDecimal getSum()
    {
    return sum;
    }

    public void setSum(BigDecimal sum)
    {
    this.sum = sum;
    }

    public BigDecimal getMax()
    {
    return max;
    }

    public void setMax(BigDecimal max)
    {
    this.max = max;
    }

    public BigDecimal getMin()
    {
    return min;
    }

    public void setMin(BigDecimal min)
    {
    this.min = min;
    }

    public BigDecimal getAvg()
    {
    return avg;
    }

    public void setAvg(BigDecimal avg)
    {
    this.avg = avg;
    }

    public int getCount()
    {
    return count;
    }

    public void setCount(int count)
      {
        this.count = count;
      }
}

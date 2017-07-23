package com.transapp.mapper;

import com.transapp.domain.Statistics;
import com.transapp.dto.GetStatisticsResponseDto;
import org.springframework.stereotype.Component;

@Component
public class StatisticsMapperImpl implements StatisticsMapper
{

  @Override
  public GetStatisticsResponseDto convertToResponseDto(Statistics statistics)
  {
    GetStatisticsResponseDto getStatisticsResponseDto = new GetStatisticsResponseDto();
    getStatisticsResponseDto.setAvg(statistics.getAvg());
    getStatisticsResponseDto.setCount(statistics.getCount());
    getStatisticsResponseDto.setMax(statistics.getMax());
    getStatisticsResponseDto.setMin(statistics.getMin());
    getStatisticsResponseDto.setSum(statistics.getSum());
    return getStatisticsResponseDto;
  }
}

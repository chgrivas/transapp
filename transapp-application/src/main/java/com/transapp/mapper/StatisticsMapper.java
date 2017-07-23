package com.transapp.mapper;

import com.transapp.domain.Statistics;
import com.transapp.dto.GetStatisticsResponseDto;

public interface StatisticsMapper
{
  GetStatisticsResponseDto convertToResponseDto(Statistics statistics);
}

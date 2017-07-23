package com.transapp.service;

import com.transapp.domain.Statistics;
import com.transapp.dto.GetStatisticsResponseDto;
import com.transapp.mapper.StatisticsMapper;
import com.transapp.repository.StatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class StatisticsServiceImpl implements StatisticsService
{

  @Autowired
  StatisticsRepository statisticsRepository;

  @Override
  public Statistics getLastSixtySecondsStatistics()
  {
    return statisticsRepository.getLastSixtySecondsStatistics();
  }
}

package com.transapp.repository;

import com.transapp.domain.Statistics;

public interface StatisticsRepository
{
  Statistics getLastSixtySecondsStatistics();
}

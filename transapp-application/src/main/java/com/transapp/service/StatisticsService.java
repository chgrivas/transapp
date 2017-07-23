package com.transapp.service;

import com.transapp.domain.Statistics;

public interface StatisticsService
{
  Statistics getLastSixtySecondsStatistics();
}

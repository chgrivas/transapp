package com.transapp.repository;

import com.transapp.domain.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StatisticsRepositoryImpl implements StatisticsRepository
{
  private static final String SELECT_STATISTICS = "SELECT * FROM STATISTICS;";

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Autowired
  StatisticsRowMapper statisticsRowMapper;

  @Override
  public Statistics getLastSixtySecondsStatistics()
  {
    return jdbcTemplate.queryForObject(SELECT_STATISTICS, statisticsRowMapper);
  }
}

package com.transapp.repository;

import com.transapp.domain.Statistics;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Component
public class StatisticsRowMapper implements RowMapper<Statistics>
{
  @Override
  public Statistics mapRow(ResultSet resultSet, int rowNum) throws SQLException
  {
    Statistics statistics = new Statistics();
    statistics.setCount(resultSet.getInt("COUNT"));
    statistics.setSum(Optional.ofNullable(resultSet.getBigDecimal("SUM")).orElse(BigDecimal.ZERO));
    statistics.setAvg(Optional.ofNullable(resultSet.getBigDecimal("SUM")).orElse(BigDecimal.ZERO));
    statistics.setMax(Optional.ofNullable(resultSet.getBigDecimal("SUM")).orElse(BigDecimal.ZERO));
    statistics.setMin(Optional.ofNullable(resultSet.getBigDecimal("SUM")).orElse(BigDecimal.ZERO));
    return statistics;
  }
}

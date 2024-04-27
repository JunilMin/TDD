package io.hhplus.tdd.point.repository;

import io.hhplus.tdd.database.PointHistoryTable;
import io.hhplus.tdd.point.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import java.util.List;
import org.springframework.stereotype.Repository;


public interface PointHistoryRepository {
  List<PointHistory> findAllByUserId(Long userId);

  PointHistory save(Long userId, Long amount, TransactionType transactionType, long updateMillis)
      throws InterruptedException;
}
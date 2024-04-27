package io.hhplus.tdd.point.repository;


import io.hhplus.tdd.database.PointHistoryTable;
import io.hhplus.tdd.point.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PointHistoryRepositoryImpl implements PointHistoryRepository {
  private final PointHistoryTable pointHistoryTable;

  public PointHistoryRepositoryImpl(PointHistoryTable pointHistoryTable) {
    this.pointHistoryTable = pointHistoryTable;
  }

  @Override
  public List<PointHistory> findAllByUserId(Long userId) {
    return pointHistoryTable.selectAllByUserId(userId);
  }

  @Override
  public PointHistory save(Long userId, Long amount, TransactionType transactionType, long updateMillis)
      throws InterruptedException {
    return pointHistoryTable.insert(userId, amount, transactionType, updateMillis);
  }
}
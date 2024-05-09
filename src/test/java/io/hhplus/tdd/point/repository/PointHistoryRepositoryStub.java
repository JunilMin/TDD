package io.hhplus.tdd.point.repository;


import io.hhplus.tdd.point.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import java.util.ArrayList;
import java.util.List;

public class PointHistoryRepositoryStub implements PointHistoryRepository {
  private final List<PointHistory> table = new ArrayList<>();

  @Override
  public List<PointHistory> findAllByUserId(Long userId) {
    if (userId == 1) {
      return List.of(
          new PointHistory(1, userId, 5_000L, TransactionType.CHARGE, 1),
          new PointHistory(2, userId, 1_000L, TransactionType.USE, 2)
      );
    }
    return table;
  }

  @Override
  public PointHistory save(Long userId, Long amount, TransactionType transactionType, long updateMillis) {
    PointHistory pointHistory = new PointHistory(1, userId, amount, transactionType, updateMillis);
    table.add(pointHistory);
    return pointHistory;
  }
}
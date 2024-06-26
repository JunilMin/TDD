package io.hhplus.tdd.point.service;

import io.hhplus.tdd.point.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import io.hhplus.tdd.point.UserPoint;
import java.util.List;

public interface PointServiceUseCase {
  UserPoint findPointByUserId(Long userId) throws InterruptedException;

  List<PointHistory> findHistoryByUserId(Long userId);

  UserPoint chargePoint(Long userId, Long amount) throws Exception;

  UserPoint usePoint(Long userId, Long amount) throws Exception;

  PointHistory recordHistory(UserPoint userPoint, Long amount, TransactionType transactionType) throws Exception;
}
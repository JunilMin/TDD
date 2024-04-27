package io.hhplus.tdd.point.repository;

import io.hhplus.tdd.database.UserPointTable;
import io.hhplus.tdd.point.UserPoint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


public interface UserPointRepository {
  UserPoint findUserPointById(Long userId);

  UserPoint save(Long userId, Long amount) throws InterruptedException;
}
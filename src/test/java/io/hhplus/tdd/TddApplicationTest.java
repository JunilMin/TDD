package io.hhplus.tdd;

import static org.junit.jupiter.api.Assertions.*;

import io.hhplus.tdd.database.PointHistoryTable;
import io.hhplus.tdd.database.UserPointTable;
import io.hhplus.tdd.point.PointHistory;
import io.hhplus.tdd.point.UserPoint;
import io.hhplus.tdd.point.service.PointService;
import java.awt.Point;
import org.apiguardian.api.API;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

class TddApplicationTest {

  private PointService pointService;

  @BeforeEach
  public void setUp() {

    pointService = new PointService();
  }

  @Test
  public void testChargePoints() {
    Point point = pointService.charge(1L, 100);
    assertEquals(100, point.getClass());
  }

//  @Test
//  public void testUsePoints() {
//    pointService.charge(1L, 100);
//    assertTrue(pointService.use(1L, 50));
//    assertEquals(50, pointService.use(1L));
//  }

//  @Test
//  public void testGetBalance() {
//    pointService.charge(1L, 100);
//    assertEquals(100, pointService.history(1L));
//  }

  @Test
  public void testGetHistories() {
    pointService.charge(1L, 100);
    pointService.use(1L, 50);
    assertEquals(2, pointService.histories(1L).size());
  }

  @Test
  public void testInsufficientBalance() {
    pointService.charge(1L, 100);
    assertFalse(pointService.use(1L, 150));
  }
}
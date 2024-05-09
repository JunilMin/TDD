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

@SpringBootTest
class TddApplicationTests {

  @Test
  void contextLoads() {
  }

}
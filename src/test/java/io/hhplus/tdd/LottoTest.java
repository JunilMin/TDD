package io.hhplus.tdd;

import static io.hhplus.tdd.lottoPractice.Lotto.MAX_NUMBER;
import static io.hhplus.tdd.lottoPractice.Lotto.MIN_NUMBER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.hhplus.tdd.lottoPractice.Lotto;

public class LottoTest {

  private static void createLottoNumber() {
    System.out.println("");
  }

  // createLottoNumber라는 메소드를 테스트 했을때
  // 숫자가 6개여야하고 정렬이 된 상태여야 한다.
  @Test
  public static void main(String[] args) {
    //given
    // 5 개의 숫자
    @Test
    void createLottoNumber() {
      final Lotto lotto = new Lotto();

      //given
      List<Integer> collect = IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER)
          .boxed()
          .collect(Collectors.toList());


      //when
      //45개의 숫자 중 6개 뽑았을 때

      List<Integer> lottoNumbers = collect.stream()
          .limit(6L)
          .collect(Collectors.toList());

      //then
      // 오름차순 정렬된 상태

//      assertThatThrownBy(lottoNumbers.);
      assertThat(lottoNumbers.size() == 7);
    }
  }
}
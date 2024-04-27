package io.hhplus.tdd.lottoPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto {

  public static int MIN_NUMBER = 1;
  public static int MAX_NUMBER = 45;


  public static void main(String[] args) {
    // 1 ~ 45 6 중복이 없어야한다.

    List<Integer> collect = IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER)
        .boxed()
        .collect(Collectors.toList());

    Collections.shuffle(collect);

    List<Integer> lottoNumbers = collect.stream()
        .limit(6L)
        .collect(Collectors.toList());

    Collections.sort(lottoNumbers);
    System.out.println(lottoNumbers);





// createLottoNumber라는 메소드를 테스트 했을때
// 숫자가 6개여야하고 정렬이 된 상태여야 한다.
  }

}

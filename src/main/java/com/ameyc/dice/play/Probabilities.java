package com.ameyc.dice.play;

import com.ameyc.dice.Dice;
import com.ameyc.dice.NumberedDice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * TODO: Explain This
 *
 * @author Amey Chinchorkar
 * @since 3/2/18
 */
public class Probabilities {

  public Map<Integer, List<Integer>> twoDiceHistogram() {
    Dice<Integer> dice1 = new NumberedDice(6);
    Dice<Integer> dice2 = new NumberedDice(6);

    List<Integer> values1 = Arrays.asList(dice1.getFaces());
    List<Integer> values2 = Arrays.asList(dice2.getFaces());

    return values1.stream()
        .flatMap(i -> values2.stream().map(j -> i + j))
        .collect(Collectors.groupingBy(Integer::intValue));
  }

  public static void main(String[] args) {
    Map<Integer, List<Integer>> sums = new Probabilities().twoDiceHistogram();
    sums.entrySet().forEach(entry -> System.out.printf("%2d : %s %n", entry.getKey(), entry.getValue()));
  }
}

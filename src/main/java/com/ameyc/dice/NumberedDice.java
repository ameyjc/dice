package com.ameyc.dice;

import java.util.stream.Stream;

/**
 * TODO: Explain This
 *
 * @author Amey Chinchorkar
 * @since 3/2/18
 */
public class NumberedDice extends Dice<Integer> {

  public NumberedDice(int sides) {
    super(sides);
    this.faces = Stream.iterate(1, x -> x + 1).limit(sides).toArray(Integer[]::new);
  }

}

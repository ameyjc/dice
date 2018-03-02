package com.ameyc.dice;

import java.util.Random;

/**
 * TODO: Explain This
 *
 * @author Amey Chinchorkar
 * @since 3/2/18
 */
public abstract class Dice<T> {

  private int sides;
  protected T[] faces;

  public Dice(int sides) {
    this.sides = sides;
  }

  public int getSides() {
    return sides;
  }

  public T[] getFaces() {
    return faces;
  }

  public T getRandomValue() {
    return faces[new Random().nextInt(sides)];
  }
}

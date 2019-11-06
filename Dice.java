package org.improving;

import java.util.Random;

public class Dice {

    Random random = new Random();

    public int rollDice() {
        var die = random.nextInt(6) + 1;
        return die;
    }
}

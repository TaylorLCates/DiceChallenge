package org.improving;

import java.util.Random;

public class LoadedDice {
    Random random = new Random();
    Dice dice = new Dice();

    public int rollLoadedDice(int loadedSide) {
        if ((random.nextInt(100) +1) <= 50) {
            return loadedSide;
        } else return dice.rollDice();
    }
}

package org.improving;

import java.util.Random;

public class DiceCup {
    Random random = new Random();
    Dice dice = new Dice();
    boolean balloonIntegrity = true;
    String fellOutOfCup;

    public String shakeCup(int numOfDice, boolean balloon){
        int diceTotal = 0;

        if (!balloon) {
            fellOutOfCup = "No balloon added";
        } else if (balloonIntegrity && balloon) {
            if ((random.nextInt(100) +1) <= 50) {
                fellOutOfCup = "The balloon broke and cannot be put back into the cup.";
                balloonIntegrity = false;
            } else fellOutOfCup = "Thlurpy-plop";
        }
        for (int i = 0; i < numOfDice; i++) {
            int diceResult = dice.rollDice();
            diceTotal = diceTotal + diceResult;
        }

        return diceTotal + " " + fellOutOfCup;
    }
}

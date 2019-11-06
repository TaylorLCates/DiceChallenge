package org.improving;

public class DiceCup {

    Dice dice = new Dice();
    int diceTotal = 0;

    public int shakeCup(int numOfDice){

        for (int i = 0; i <= numOfDice; i++) {
            int diceResult = dice.rollDice();
            diceTotal = diceTotal + diceResult;


        } return diceTotal;
    }
}

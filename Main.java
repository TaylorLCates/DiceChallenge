package org.improving;

public class Main {


    public static void main(String[] args) {
    Dice dice = new Dice();
    DiceCup diceCup = new DiceCup();
    LoadedDice loadedDice = new LoadedDice();

        System.out.println("Rolling 1 die: " + dice.rollDice());
        System.out.println("Rolling 3 dice in a cup: " + diceCup.shakeCup(1, false));
        System.out.println("Rolling 15 dice in a cup: " + diceCup.shakeCup(15, true));
        System.out.println("Rolling 30 dice in a cup: " + diceCup.shakeCup(30, true));
        System.out.println("Rolling 120 dice in a cup: " + diceCup.shakeCup(120, false));
        System.out.println("Rolling 120 dice in a cup: " + diceCup.shakeCup(120, true));
        System.out.println("Rolling 120 dice in a cup: " + diceCup.shakeCup(120, true));
        System.out.println("Rolling 120 dice in a cup: " + diceCup.shakeCup(120, true));
        System.out.println("Rolling 120 dice in a cup: " + diceCup.shakeCup(120, true));
        System.out.println("Rolling a loaded die set to 1: " + loadedDice.rollLoadedDice(1));
        System.out.println("Rolling a loaded die set to 1: " + loadedDice.rollLoadedDice(1));

    }
}

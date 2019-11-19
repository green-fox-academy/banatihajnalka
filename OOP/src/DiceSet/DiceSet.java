package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

//    public DiceSet() {
//        roll();
//        System.out.println("new dice " + dice.toString());
//    }
//
//    public DiceSet(ArrayList<Integer> dice) {
//        this.dice = dice;
 //   }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        int current = 0;
        int counter = 0;
        while (current != 36) {
            diceSet.reroll();
            current = diceSet.getCurrent(0) + diceSet.getCurrent(1) +  diceSet.getCurrent(2) + diceSet.getCurrent(3) + diceSet.getCurrent(4) + diceSet.getCurrent(5);
            System.out.println("Current roll: " + diceSet.getCurrent());
            counter++;
        }
        System.out.println("No of rolls: " + counter);


//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.roll());
//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.getCurrent(5));
//        diceSet.reroll();
//        System.out.println(diceSet.getCurrent());
//        diceSet.reroll(4);
//        System.out.println(diceSet.getCurrent());


    }
}
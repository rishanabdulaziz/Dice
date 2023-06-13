/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package diceapplication;

import java.util.*;

/**
 *
 * @author Rishan Aziz
 */

public class TestProgRollDie {

    /**
     * @param args the command line arguments
     */

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        RollDie die1 = new RollDie();
        RollDie die2 = new RollDie();

        System.out.println("Line 9: die1: " + die1);
        System.out.println("Line 10: die2: " + die2);

        System.out.println("Line 11: After rolling "
                + "die1: " + die1.roll());
        System.out.println("Line 12: After rolling "
                + "die2: " + die2.roll());

        System.out.println("Line 13: Sum of the "
                + "numbers rolled by the dice is: "
                + (die1.getNum() + die2.getNum()));
        
    }

}

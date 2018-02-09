package com.company.Question_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {

    private Scanner input = new Scanner(System.in);

    public void aSwitch() {

        System.out.println("You have four options, what would you like to do. \n1. Go forward \n2. Go left \n3. Go right \n4. Go back");

        try {

            switch (input.nextInt()) {
                case 1:
                    System.out.println("You step forward onto a trap and die.");
                    break;
                case 2:
                    System.out.println("You take the left path and step onto a trap and die.");
                    break;
                case 3:
                    System.out.println("You take the right path and step onto a trap and die.");
                    break;
                case 4:
                    System.out.println("You go the way you came, unfortunately you were running from monsters and the captured you and killed you.");
                    break;
                default:
                    System.out.println("Select a number from 1 - 4");
                    break;

            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 - 4");
            aSwitch();
        }


    }
}

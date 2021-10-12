package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean numberGuessed = false;

        int num = (int) (Math.random() * 100.0 + 1);
        int guess;

        System.out.println("Can you guess my number? (Between 1 & 100)");

        while (!numberGuessed) {
            guess = input.nextInt();
            if (guess == num) {
                System.out.println("Congrats! That was my number");
                numberGuessed = true;
            } else if (Math.abs(num - guess) < 3) {
                System.out.println("You're right there! Try again");
            } else if (Math.abs(num - guess) < 10) {
                System.out.println("That's pretty close but not quite, try again.");
            } else {
                System.out.println("Not even close, try again.");
            }
        }
    }
}

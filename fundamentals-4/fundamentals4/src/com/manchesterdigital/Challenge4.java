package com.manchesterdigital;

import java.util.Random;
import java.util.Scanner;

public class Challenge4 {
    private static final String USER_WINS = "User Wins!!!";
    private static final String COMPUTER_WINS = "Computer Wins!!!";

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        outcome(userChoice);

    }

    static void outcome(String userChoice) {
        Random random = new Random();
        int computerChoice = random.nextInt(3);
        String[] arr = {"rock", "paper", "scissors"};
        System.out.println(arr[computerChoice]);

        if(arr[computerChoice].equals(userChoice)) {
            System.out.println("Draw");

        } else if (arr[computerChoice].equals("paper") && userChoice.equals("rock")) {
            System.out.println(COMPUTER_WINS);
        } else if (arr[computerChoice].equals("rock") && userChoice.equals("scissors")) {
            System.out.println(COMPUTER_WINS);
        } else if (arr[computerChoice].equals("scissors") && userChoice.equals("paper")) {
            System.out.println(COMPUTER_WINS);
        } else {
            System.out.println(USER_WINS);
        }
    }
}

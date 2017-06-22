import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int playWinCount = 0;
        int compWinCount = 0;
        int playNum;
        int compNum;
        int playAgain;

        do {
            System.out.println("Welcome to rock, paper, scissors!");
            do {
                System.out.println("Please select your choice:");
                System.out.println("0 - Rock");
                System.out.println("1 - Paper");
                System.out.println("2 - Scissors");

                playNum = input.nextInt();
            } while (playNum > 2 || playNum < 0);
            compNum = number.nextInt(3);
            System.out.print("Player threw ");
            switch (playNum) {
                case 0: System.out.println("rock");
                break;
                case 1: System.out.println("paper");
                break;
                case 2: System.out.println("scissors");
                break;
            }
            System.out.print("Computer threw ");
            switch (compNum) {
                case 0: System.out.println("rock");
                    break;
                case 1: System.out.println("paper");
                    break;
                case 2: System.out.println("scissors");
                    break;
            }

            if (playNum == 0) {
                if (compNum == 0) {
                    System.out.println("Game is tied");
                } else if (compNum == 1) {
                    System.out.println("Computer wins");
                    compWinCount++;
                } else {
                    System.out.println("Player wins");
                    playWinCount++;
                }
            } else if (playNum == 1) {
                if (compNum == 0) {
                    System.out.println("Player wins");
                    playWinCount++;
                } else if (compNum == 1) {
                    System.out.println("Game is tied");
                } else {
                    System.out.println("Computer wins");
                    compWinCount++;
                }
            } else if (playNum == 2) {
                if (compNum == 0) {
                    System.out.println("Computer wins");
                    compWinCount++;
                } else if (compNum == 1) {
                    System.out.println("Player wins");
                    playWinCount++;
                } else {
                    System.out.println("Game is tied");
                }
            }
            System.out.println();
            System.out.println("Results: ");
            System.out.print("Player wins: ");
            System.out.println(playWinCount);
            System.out.print("Comp wins: ");
            System.out.println(compWinCount);
            do {
                System.out.println("Play again?");
                System.out.println("0 - No 1 - Yes");
                playAgain = input.nextInt();
            } while (playAgain > 1 || playAgain < 0);

        } while(playAgain == 1);
    }
}

import java.util.Scanner;
import java.lang.Math;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playerA;
        String playerB;
        String loopRPS;

        String rock = "R";
        String paper = "P";
        String scissors = "S";
        String yes = "Y";
        String no = "N";

        boolean valid = true;
        boolean boolA = true;
        boolean boolB = true;
        boolean playAgain = true;

        do {
            System.out.println("Welcome to Rock. Paper.\nSCISSORS!");
            System.out.println("Please enter the choice for Player 1 below.");

           do {


               playerA = scan.nextLine();

               //First If to check If playerA chose a valid choice.
               if (playerA.equalsIgnoreCase("R")) {
                   playerA = "R";
                   boolA = false;
               } else if (playerA.equalsIgnoreCase("P")) {
                   playerA = "P";
                   boolA = false;
               } else if (playerA.equalsIgnoreCase("S")) {
                   playerA = "S";
                   boolA = false;
               } else {
                   System.out.println("That is not R, P, or S (lowercase is allowed), please try again.");
               }

           } while (boolA);

            System.out.println("Please enter the choice for Player 2 below.");

            do {

                playerB = scan.nextLine();

                //Second If to check If playerA chose a valid choice.
                if (playerB.equalsIgnoreCase("R")) {
                    playerB = "R";
                    boolB = false;
                } else if (playerB.equalsIgnoreCase("P")) {
                    playerB = "P";
                    boolB = false;
                } else if (playerB.equalsIgnoreCase("S")) {
                    playerB = "S";
                    boolB = false;
                } else {
                    System.out.println("That is not R, P, or S (lowercase is allowed), please try again.");
                }

            } while (boolB);

            if (playerA.equalsIgnoreCase(playerB)){
                System.out.println("There is a tie, Player 1 and Player 2 both chose " + playerA + ".");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock. Player 2 wins.");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors. Player 1 wins.");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock. Player 1 wins.");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors cut Paper. Player 2 wins.");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors. Player 2 wins.");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock. Player 1 wins.");
            }


            do {
                System.out.println("Would you like to play again? Y/N");
                loopRPS = scan.nextLine();

                if (loopRPS.equalsIgnoreCase("Y")) {
                    System.out.println("Repeating Rock, Paper, Scissors.");
                    playAgain = false;
                } else if (loopRPS.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for playing, see you next time.");
                    playAgain = false;
                    valid = false;
                } else {
                    System.out.println("That is not a valid input, remember Y/N.");
                }
            } while (playAgain);

        } while (valid);

    }
}
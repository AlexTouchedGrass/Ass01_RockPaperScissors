import java.util.Scanner;
import java.lang.Math;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playerA;
        String playerB;

        String rock = "R";
        String paper = "P";
        String scissors = "S";

        boolean valid = true;

        do {
            System.out.println("Welcome to Rock. Paper.\nSCISSORS!");
            System.out.println("Please enter the choice for Player 1 below.");

            playerA = scan.nextLine();

            //First If to check If playerA chose a valid choice.
            if (playerA.equalsIgnoreCase("R")){
                playerA = "R";
            } else if (playerA.equalsIgnoreCase("P")){
                playerA = "P";
            } else if (playerA.equalsIgnoreCase("S")) {
                playerA = "S";
            } else {
                System.out.println("That is not R, P, or S (lowercase is allowed), please try again.");
            }

            System.out.println("Please enter the choice for Player 2 below.");

            playerB = scan.nextLine();

            //Second If to check If playerA chose a valid choice.
            if (playerB.equalsIgnoreCase("R")){
                playerB = "R";
            } else if (playerB.equalsIgnoreCase("P")){
                playerB = "P";
            } else if (playerB.equalsIgnoreCase("S")) {
                playerB = "S";
            } else {
                System.out.println("That is not R, P, or S (lowercase is allowed), please try again.");
            }

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

        } while (valid);

    }
}
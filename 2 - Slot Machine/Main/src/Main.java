/*A slot machine is a gambling device that the user inserts money into and then pulls a lever. The slot machine then
displays a set of random images. If two or more of the images match, the user wins an amount of money.

Create a program that simulates a slot machine. When the program runs, it should do the following:
- Assume the user has an initial budget of 100.
- Asks the user to enter the amount of money he wants to bid and checks if he has that amount available.
If not, the program will ask for another amount.
- Instead of displaying images, the program will randomly select a word from the following list: Cherries, Oranges,
Plums, Bells, Melons, Bars. The program should randomly select a word from this list three times and display all three words.
- If none of the randomly selected words match, the program will inform the user that he has won $0.
If two of the words match, the program will inform the user that he has won two times the amount entered.
If three of the words match, the program will inform the user that he or she has won three times the amount entered.
- The program will ask whether the user wants to play again. If so, these steps are repeated.
If not, the program displays the total amount of money entered into the slot machine and the total amount won.
- If the user's budget becomes zero, the game is over.*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //The user is starting with a budget of 100 coins
        int userBudget = 100;
        //variable to calculate how much money was spent by the user
        int amountEntered = 0;
        //variable to calculate how much money was won by the user
        int amountWon = 0;

        //boolean who checks if the user wants to play again
        boolean playAgain = true;

        //Scanner which asks the user how much money does he want to bid
        Scanner sc = new Scanner(System.in);
        System.out.println("How much do you want to bid: ");
        int userBid = sc.nextInt();

        //Array list with the words from which the program will choose
        ArrayList<String> slots = new ArrayList<>();
        slots.add("Cherries");
        slots.add("Oranges");
        slots.add("Plums");
        slots.add("Bells");
        slots.add("Melons");
        slots.add("Bars");

        //do while - cycle to execute the game logic while the player still wants to play and has money to spend
        do {
            //If statement to check that the user still wants to play
            if (playAgain) {
                //if statement that checks if the inputted by the user bid is negative number
                if (userBid <= 0) {
                    //while cycle to prevent the user from inputting negative bids
                    while (userBid <= 0) {
                        System.out.println("You've entered negative number! Please enter a positive one!");
                        userBid = sc.nextInt();
                    }
                    //Updating of the spent and won sums of money
                    userBudget = userBudget - userBid;
                    amountEntered = amountEntered + userBid;
                //else If statement to check if the inputted bid is larger than the remaining player money
                } else if (userBid > userBudget) {
                    //While cycle to prevent the user spending more money than what he actually has
                    while (userBid > userBudget) {
                        System.out.println("You don't have that much money, please lower your bid: ");
                        userBid = sc.nextInt();
                    }
                //else statement to handle normal positive bids
                } else {
                    userBudget = userBudget - userBid;
                    amountEntered = amountEntered + userBid;
                }

                //The program chooses 3 random words from the predefined list
                Random rand = new Random();
                String slot1 = slots.get(rand.nextInt(slots.size()));
                String slot2 = slots.get(rand.nextInt(slots.size()));
                String slot3 = slots.get(rand.nextInt(slots.size()));

                System.out.println(slot1);
                System.out.println(slot2);
                System.out.println(slot3);

                //if statement to handle the case where the player got 3 times the same word
                if (slot1.equals(slot2) && slot2.equals(slot3)) {
                    userBudget = userBudget + userBid * 3;
                    amountWon = amountWon + userBid * 3;
                    System.out.println("You've won: " + userBid * 3);
                //else if statement to handle the case where the player got 2 times the same word
                } else if (slot1.equals(slot2) || slot1.equals(slot3) || slot2.equals(slot3)) {
                    userBudget = userBudget + userBid * 2;
                    amountWon = amountWon + userBid * 2;
                    System.out.println("you've won: " + userBid * 2);
                //else statement to handle the case where the player didn't have matching words
                } else {
                    System.out.println("You've won: 0");
                }
            } else {
                break;
            }
            //if statement - to check if the user is out of money. If that's the case it's game over!
            if (userBudget == 0) {
                System.out.println("Sorry you're out of money!");
                break;
            }
            //The program informs the user how much money he has left and asks if he want's to play again
            System.out.println("You have: " + userBudget + " left.");
            System.out.println("Do you want to bid again? (Y/N): ");
            String bidAgain = sc.next();

            //if statement in case the user doesn't want to play again, the playAgain boolean is set to false and the do while loop brakes
            if (bidAgain.equals("N")) {
                playAgain = false;
                break;
            }
            System.out.println("Please enter your next bid: ");
            userBid = sc.nextInt();

        } while (playAgain);
        //The program informs the user how much money he has left, how much money he has spent and how much he has won
        System.out.println("You've: " + userBudget + " left.");
        System.out.println("You've spent: " + amountEntered + " on this game.");
        System.out.println("You've won: " + amountWon + " on this game!");
    }
}
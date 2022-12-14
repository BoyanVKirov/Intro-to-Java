/*Write a program with a loop that lets the user enter a series of integers. The user should enter −99 to signal the
end of the series. After all numbers have been entered, the program should display the largest and smallest of them.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner that takes the inputted from the user numbers
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a program to find the smallest and biggest numbers. If you want to stop entering numbers, enter: 99!");
        System.out.println("Enter a number: ");
        int newNumber = userInput.nextInt();

        //variables to same the biggest and the smallest numbers
        int minNumber = newNumber;
        int maxNumber = newNumber;
        //Array list to save all of the numbers that the user inputs
        ArrayList<Integer> userNumbers = new ArrayList<>();
        userNumbers.add(newNumber);
        //While loop to continue to ask the user for numbers until he enters the number 99
        while (newNumber != 99) {
            System.out.println("Enter a number: ");
            newNumber = userInput.nextInt();
            userNumbers.add(newNumber);
            //if statement to check if the last inputted number is smaller than the smallest number at the time
            if (newNumber < minNumber) {
                //if the above condition is met the smallest number is replaced in the variable
                minNumber = newNumber;
            //else if statement to check if the last inputted number is bigger than the biggest number at the time
            } else if (newNumber > maxNumber) {
                //if the above condition is met the biggest number is replaced in the variable
                maxNumber = newNumber;
            }
        }
        //the program prints all the inputted by the user numbers, plus the smallest and the biggest of them
        System.out.println("The entered numbers was: " + userNumbers);
        System.out.println("The smallest entered number was: " + minNumber);
        System.out.println("The biggest entered number was:" + maxNumber);
    }
}
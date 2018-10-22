
package assignment21;

import java.util.Random;
import java.util.Scanner;


public class Assignment21 {

    public static void main(String[] args) {
        int number = 0;
        int RandomNumber;
        int guess = 0;
      
       Scanner keyboard = new Scanner(System.in);
       Random randomNumber = new Random();
        System.out.println("*******************************");
        System.out.println(" Welcome to the Guessing Game ");
        System.out.println("*******************************");
        System.out.println("    ");
        RandomNumber = randomNumber.nextInt(10);
       
         
         while(number!=RandomNumber){
              System.out.println("Enter a number from 1 to 10 : ");
              number= keyboard.nextInt();
              guess++;
         
         if(number== RandomNumber){
             System.out.println("You won ! The number was "+RandomNumber);
         }
         else{
             System.out.println("Try again...");
         }
        
       
    }
         System.out.println("It took you " +guess + "guesses to win.");
    }
}

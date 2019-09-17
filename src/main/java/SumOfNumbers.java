
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int inputNumber = 0;
        int sumOfNumbers = 0;
        
        System.out.println("Please input a whole number");
        
        inputNumber = keyboard.nextInt();
        
         if (inputNumber < 0)
        {
            System.out.println("Please put in a whole number larger than zero. \n");
        }
        
       for(int i = 1; i <= inputNumber; ++i)
        {
            sumOfNumbers += i;
        }
        System.out.println("The sum of " + inputNumber + " = " + sumOfNumbers);
    }
}

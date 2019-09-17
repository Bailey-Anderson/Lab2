
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
public class BankCharges {
    public static void main(String[] args) {
        
        Scanner checks = new Scanner(System.in);
        
        double checkNumbers = 0;
        double bankFee = 0;
        
        System.out.println("How many checks did you write this month?");
        
        checkNumbers = checks.nextInt();
        
        if (checkNumbers > 100 || checkNumbers < 0)
        {
            System.out.println("Please put in a number from 0 - 100!\n");
        }

        while (checkNumbers > 100 || checkNumbers < 0 )
        {
            System.out.print("How many checks did you write this month?");
            checkNumbers = checks.nextInt();
            
            if (checkNumbers > 100 || checkNumbers < 0)
            {
                System.out.println("Please put in a number from 0 - 100!\n");
            }
        }
        if (checkNumbers <= 20 && checkNumbers >= 1)
        {
            bankFee = checkNumbers * 0.1;
            System.out.print("Your fee total for the month is: " + "$" + String.format("%.2f", bankFee));
        }
         if (checkNumbers <= 39 && checkNumbers >= 20)
        {
            bankFee = checkNumbers * 0.08;
            System.out.print("Your fee total for the month is: " + "$" + String.format("%.2f", bankFee));
        }
         if (checkNumbers <= 59 && checkNumbers >= 40)
        {
            bankFee = checkNumbers * 0.06;
            System.out.print("Your fee total for the month is: " + "$" + String.format("%.2f", bankFee));
        }
         if (checkNumbers <= 100000000 && checkNumbers >= 60)
        {
             bankFee = checkNumbers * 0.04;
            System.out.print("Your fee total for the month is: " + "$" + String.format("%.2f", bankFee));
        }
       
    }
}

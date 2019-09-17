
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
public class TestScores {
    public static void main(String[] args) 
    {
        Scanner grades = new Scanner(System.in);
        
        //Test Score 1
        
        int x = 0;

        System.out.print("What is test score 1: ");
        
        x = grades.nextInt();

        if (x > 100 || x < 0)
        {
            System.out.println("Please put in a percent from 0 - 100!\n");
        }

        while (x > 100 || x < 0 )
        {
            System.out.print("What is test score 1: ");
            x = grades.nextInt();
            
            if (x > 100 || x < 0)
            {
                System.out.println("Please put in a percent from 0 - 100!\n");
            }
        }
        if (x <= 100 && x >= 90)
        {
             System.out.print("Test 1 Score = A \n");
        }
         if (x <= 89 && x >= 80)
        {
             System.out.print("Test 1 Score = B\n");
        }
         if (x <= 79 && x >= 70)
        {
             System.out.print("Test 1 Score = C\n");
        }
         if (x <= 69 && x >= 60)
        {
             System.out.print("Test 1 Score = D\n");
        }
         if (x <= 59 && x >= 0)
        {
             System.out.print("Test 1 Score = F\n");
        }
         
         // Test Score 2
        int y = 0;

        System.out.print("What is test score 2: ");
        
        y = grades.nextInt();

        if (y > 100 || y < 0)
        {
            System.out.println("Please put in a percent from 0 - 100!\n");
        }

        while (y > 100 || y < 0 )
        {
            System.out.print("What is test score 2: ");
            y = grades.nextInt();
            
            if (y > 100 || y < 0)
            {
                System.out.println("Please put in a percent from 0 - 100!\n");
            }
        }
        if (y <= 100 && y >= 90)
        {
             System.out.print("Test 2 Score = A\n");
        }
         if (y <= 89 && y >= 80)
        {
             System.out.print("Test 2 Score = B\n");
        }
         if (y <= 79 && y >= 70)
        {
             System.out.print("Test 2 Score = C\n");
        }
         if (y <= 69 && y >= 60)
        {
             System.out.print("Test 2 Score = D\n");
        }
         if (y <= 59 && y >= 0)
        {
             System.out.print("Test 2 Score = F\n");
        }
         
         // Test Score 3
         
        int z = 0;

        System.out.print("What is test score 3: ");
        
        z = grades.nextInt();

        if (z > 100 || z < 0){
            System.out.println("Please put in a percent from 0 - 100!\n");
        }

        while (z > 100 || z < 0 )
        {
            System.out.print("What is test score 3: ");
            z = grades.nextInt();
            
            if (z > 100 || z < 0)
            {
                System.out.println("Please put in a percent from 0 - 100!\n");
            }
        }
        if (z <= 100 && z >= 90)
        {
             System.out.print("Test 3 Score = A\n");
        }
         if (z <= 89 && z >= 80)
        {
             System.out.print("Test 3 Score = B\n");
        }
         if (z <= 79 && z >= 70)
        {
             System.out.print("Test 3 Score = C\n");
        }
         if (z <= 69 && z >= 60)
        {
             System.out.print("Test 3 Score = D\n");
        }
         if (z <= 59 && z >= 0)
        {
             System.out.print("Test 3 Score = F\n");
        }
    }      
}

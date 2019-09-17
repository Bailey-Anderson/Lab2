
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
public class BarGraph {
    public static void main(String[] args) {
        
         double[] store = new double[5];
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter today's sales for store %d: ", i + 1);
			store[i] = keyboard.nextDouble();
		}
		
		System.out.println("\nSales Bar Chart: ");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Store %d: ", i + 1);
			
			for(int s = 0; s < store[i]/100; s++)
				System.out.print("*");
			
			System.out.println();
		}
		
		keyboard.close();
    }
}

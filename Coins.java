package completed;

import java.util.Scanner; 

public class Coins {
	public static void main (String args []) {
		@SuppressWarnings("resource")
		Scanner GLaDOS = new Scanner (System.in);
		
		//Adding the values for each coin
		double q = .25;
		double d = .10;
		double n = .05;
		double p = .01;
		
		// Welcome Start
		System.out.println("Welcome to the Coin Breakdown Program \n");
		
		//User Input into Quarter
		System.out.println("Please enter your money amount: $ ");
		double Amount = GLaDOS.nextDouble();
		
	
		//Adding the amount
		int Q = (int) (Amount * q);
		int D = (int) (Amount * d);
		int N = (int) (Amount * n);
		int P = (int) (Amount * p);
		//Printing the amount together
		System.out.println("HERE IS YOUR COIN BREAKDOWN");
		System.out.println("$ " + Amount + " = " + (Math.round(Q)) + " Quarters, " + (Math.round(D)) + " Dimes, " + (Math.round(N)) + " Nickles, " + (Math.round(P)) + " Pennies." );
		
	
		
		//int quarters = change / 25;
        //if (quarters > 0) {
          //  change = change % 25;
            ///System.out.println(quarters + " quarter coin(s)");
        //}
        
        //int dimes = change / 10;
        //if (dimes > 0) {
          //  change = change % 10;
            //System.out.println(dimes + " dime coin(s)");
        //}
        
       // int nickels = change / 5;
        // if (nickels > 0) {
           // change = change % 5;
            //System.out.println(nickels + " nickel coin(s)");
        //}
        // int pennies = change;
        //System.out.println(pennies + " penny coin(s)");
		
	}
}

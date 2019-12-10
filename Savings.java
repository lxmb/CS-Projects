package completed;

import java.util.*;
import java.io.*;

public class Savings {

	public static void main(String[] args) throws IOException {
	
		@SuppressWarnings("resource")
		Scanner GLaDOS = new Scanner (new File ("savings.dat"));
			float sum = 0;
			while(GLaDOS.hasNext()) 
			{
				double i = Double.parseDouble(GLaDOS.nextLine());
				double next = Math.ceil(i);
				double difference = next - i;
				sum += difference;
				
			}
			System.out.println("$ " + sum);
			}
			
}

package completed;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner GLaDOS = new Scanner (new File("homework.dat"));
		
		int nextLines = GLaDOS.nextInt();
		GLaDOS.hasNextLine();
		
		for(int i = 0; i < nextLines; i++) {
			int A, B, result = 0;
			String operation;
			
			A = GLaDOS.nextInt();
			operation = GLaDOS.next();
			B = GLaDOS.nextInt();
			GLaDOS.hasNextLine();
			
			switch (operation.charAt(0)) {
			case '+':
				result = A + B;
				break;
			case '-' :
				result = A - B;
				break;
			case '*' :
				result = A * B;
				break;
				
			}
			System.out.println(A + " " + operation + " " + B + " = " + result);
				
			
			}
		}
	}



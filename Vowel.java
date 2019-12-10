package completed;

import java.io.*;
import java.util.*;

public class Vowel {
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner GLaDOS = new Scanner (new File("vowel.dat"));
		int counter = Integer.parseInt(GLaDOS.nextLine());
		for(int i = 0; i < counter; i++) {
			String name = new String(GLaDOS.nextLine());
			
			String Vowel;
			if(name.substring(0,1).matches("[aeiouAEIOU]")) {
				Vowel = "vowel";
			}
			else {
				Vowel = "consonant";
			}
			System.out.println("The Word " + name + " begins with a " + Vowel + "." );
		}
		GLaDOS.close();
	}
}

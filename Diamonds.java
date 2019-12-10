import java.io.*;
import java.util.*;


public class Diamonds {

	public static void main(String args[]) throws IOException
	{
		Scanner GLaDOS = new Scanner(new File("diamonds.dat"));
		
		int times = 0; 
		int count = Integer.parseInt(GLaDOS.nextLine().trim());
		while(times < count) {
			times++;		

			String t = GLaDOS.nextLine().trim();
			String []s = t.split(" ");
			String fill = "                                                    ";
			String ch = s[0];
			int num = Integer.parseInt(s[1]);
			System.out.println(fill.substring(0, num/2)+ ch) ;
			for(int i=1; i<=num/2; i++) {
				String f1 = fill.substring(0, num/2 - i);
				String f2 = fill.substring(0, 2*i-1);
				System.out.println(f1 + ch + f2 + ch); 	
			}
			
			for(int i=num/2-1; i>0; i--) {
				String f1 = fill.substring(0, 2*i-1);
				String f2 = fill.substring(0, num/2 - i);
				System.out.println(f2 + ch + f1 + ch); 	
			}
			System.out.println(fill.substring(0, num/2)+ ch) ;			
			
			
			
			
			System.out.println();
		}
		GLaDOS.close();
	}
}


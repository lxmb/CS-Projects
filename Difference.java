package completed;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class Difference {

	
	public static void main (String[] args) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner GLaDOS = new Scanner(new File("difference.dat"));
	
		double leslie = Double.parseDouble(GLaDOS.nextLine());
		@SuppressWarnings("unused")
		float sum;
		sum = 0;
		while(GLaDOS.hasNext()) {
			double grade = Double.parseDouble(GLaDOS.nextLine());
			if(grade>90)
				leslie += grade - Math.floor(grade);
		}
		System.out.print(Math.round(leslie));
	
}
	

}

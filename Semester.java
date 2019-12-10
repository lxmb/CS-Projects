package completed;
import java.util.*;
import java.io.*; 

public class Semester {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner GLaDOS = new Scanner(new File("semester.dat"));
		int counter = Integer.parseInt(GLaDOS.nextLine().trim());
		String[] value = new String [counter];
		for (int t = 0; t < counter; t++);
			int t = 0;
			value[t] = GLaDOS.nextLine().trim();
	
	
	{

	for(int r = 0; r < counter; r++) {
		String[] total = ((String) value[r]).split(" ");
		double B = Integer.parseInt(total[0]);
		double C = Integer.parseInt(total[1]);
		double D = Integer.parseInt(total[2]);
		double E = Integer.parseInt(total[3]);
		@SuppressWarnings("unused")
		double F = Integer.parseInt(total[4]);
		double BB = C + D + E;
		double CC = BB / 3;
		double i = 0;
		@SuppressWarnings("unused")
		double DD = i - (CC + D + E);
		System.out.printf("%.0f", B);
		System.out.print(" ");
		System.out.printf("%.0f\n", Math.ceil(CC));
		
	}
	
	}
	}
}



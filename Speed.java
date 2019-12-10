
import java.util.*;

import java.io.*;

public class Speed {

	@SuppressWarnings("unused")
	private static int average;

	private static double distance;

	private static double hours;

	private static boolean dog;

  public static void main(String args[]) throws IOException

  { 

	  Scanner god= new Scanner(new File("speed.dat"));

	  int count=Integer.parseInt(god.nextLine().trim());

	  for (int i=0; i< count; i++) {

		  String T = god.nextLine().trim();

		  String [] Toll= T.split(" ");

		  distance= Integer.parseInt(Toll[0]);

		  hours=Integer.parseInt(Toll[1]);

		  getAverage(distance,hours);

		  if(dog) {

			  System.out.println("SPEEDING TICKET");

		  }else {

			  System.out.println("NO SPEEDING TICKET");

		  }

	  }

	  god.close();

  }

  

  public static void getAverage(double distance, double hours ) {

	 double finale= Math.ceil(distance/hours);

	 int f = (int)finale;

	 Speed.average= f;

	 if(f>55) {

		Speed.dog=true; 

	 }else {

		Speed.dog=false;

	 }

  }

  

}



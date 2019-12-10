
import java.io.*;
import java.util.Scanner;
public class Rocio {
	public static void main(String args[]) throws FileNotFoundException
{
		Scanner GLaDOS = new Scanner(new File("Rocio.dat"));
			while (GLaDOS.hasNext())
{
		String [] values = GLaDOS.nextLine().trim().split(" ");
		int row = Integer.parseInt(values[0]);
		int column = Integer.parseInt(values[1]);
			main(column,row);
			for(int i = 0;i<1;i++)
			{
				for(int b =0;b<row;b++)
			{
					System.out.print("=");

			}
						System.out.println();
			}
	}
			GLaDOS.close();
}

	public static void main(int column, int row)
{
		for(int i = 0;i<column;i++)
{
		for(int k=0;k<i;k++)
{
				System.out.print(" ");
}
				System.out.print("*");
		for(int k = 0; k<row -2*i -2;k++)
{
				System.out.print(" ");
}
				System.out.print("*");
				System.out.println();
}
		for(int i=0;i<row-2*column;i++)
{
		for(int k =0;k<column;k++)
{
				System.out.print(" ");
}
		for(int c=0;c<row-2*column;c++)
{
				System.out.print("*");
}
				System.out.println();
}
		for(int i = 0;i<column;i++)
{
		for(int c=column;c>i+1;c--)
{
				System.out.print(" ");
}
				System.out.print("*");
		for(int c=0;c<row-2*column+2*i;c++)
{
				System.out.print(" ");
}
				System.out.print("*");
				System.out.println();

}
}
}
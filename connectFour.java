import java.util.*;

		//Bugs: Winner checking system doesn't work

		//Bugs: If zero is entered the program crashes

		public class connectFour {

		private static char board[][]= new char [7][7];
		public static int Player = 1;
		private static Scanner GLaDOS;
		private static int rows[]=new int[7];
		private static int dog;
		private static int c1;
		private static int r1;
		private static int c=0;
		private static int r=0;

		public static void main(String args[]) {

		for(int i=0;i<7;i++){

		connectFour.rows[i]=6;

		}

		GLaDOS = new Scanner(System.in);

		 System.out.println(Arrays.toString(rows));

		printBoard();

		gameLoop();


		 }

		 public static void gameLoop() { while(!(1 != 1)) {


		System.out.println("Player "+ Player +" enter your move.");

		String [] move = GLaDOS.nextLine().trim().split(" ");

		 r = Integer.parseInt(move[0])-1;

		 if(isValid(r)) {

		 c = rows[r];// ***

		 }

		connectFour.c1=c;

		connectFour.r1=r;

		if( Player ==1) {

		board[c][r]='O';

		if (Won('O')){

		System.out.println("Player " + Player +" has won!");

		 break;

		}

		printBoard();

		int Player =2;

		}
		else
		{

		if(isValid(r)) {

		board[c][r]='X';

		printBoard();

		if(Won('X')){

		System.out.println("Player " + Player +" has won!");

		break;

		}

		}

		int Player =1;

		}

		printBoard();

		connectFour.rows[r]=rows[r]-1;
		 }
		 

		}


		public static boolean Won(char X) {

		 for (int z=0; z<4;){

		if(board[c1][z]==X && board[c1][z+1]==X &&board[c1][z+2]==X && board[c1][z+3]==X){

		return true;

		}
		else
		{

		return false;

		}

		 }

		 for(int k=0;k<8;){

		for(int z=0;z<4;){

		if(board[z][k]== X &&board[z+1][k]== X &&board[z+2][k]== X && board[z+3][k]== X){

		return true;
		}
		else
		{
		return false;

		}

		}

		 }

		 //Use for loops for has won method

		for(int k=0; k<8;){

		for(int z=0; z<8;){

		if(board[k][z]== X && board[k+1][z+1]==X && board[k+2][z+2]==X && board[k+3][z+3]==X || board[k][z]==X && board[k-1][z-1]==X && board[k-2][z-2]==X && board[k-3][z-3]==X){

		return true;
		}
		else
		{
		return false;

		}

		}

		}

		 for (int k=0;k<8;){

		for(int z=0; z<8;){

		if(board[k][z]== X && board[k+1][z-1]==X && board[k+2][z-2]==X && board[k+3][z-3]==X || board[k][z]==X && board[k-1][z+1]==X && board[k-2][z+2]==X && board[k-3][z+3]==X){

		return true;

		}
		else
		{
		return false;
		}

		}

		 }

		return false;

		}

	
		 public static boolean isValid(int r) {

		if(r<board.length && r>0 ) {

		System.out.println("Next Player");

		return true;


		}
		else
		{

		System.out.println("Input Invalid. Try Again.");

		return false;
		}

		 }

		 public static void printBoard() 
		 {
			 for(int r=0; r<board.length;r++) 
			 {
				 System.out.print("|");

				 for(int c=0; c<board[0].length;c++) 
				 {

		System.out.print(board[r][c]+"|");
		}
		System.out.println();

		}

		 }

		 
		}
		
	
	



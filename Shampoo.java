import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Shampoo
{       
  final static double SMALL_DOG_QUANTITY = .5;
  final static int    MED_DOG_QUANTITY = 1;
  final static int    LARGE_DOG_QUANTITY = 2;
  final static int    XLARGE_DOG_QUANTITY = 4;
  final static int    SMALL_SHAMPOO_QUANTITY = 8;
  final static int    SMALL_SHAMPOO_COST = 5;
  final static int    MED_SHAMPOO_QUANTITY = 16;
  final static int    MED_SHAMPOO_COST = 9;
  final static int    LARGE_SHAMPOO_QUANTITY = 24;
  final static int    LARGE_SHAMPOO_COST = 12;

  public static int getCost(double quantity) 
  {
      if (quantity == 0) {
          return 0;
      } else if(quantity <= SMALL_SHAMPOO_QUANTITY) {
          return SMALL_SHAMPOO_COST;
      } else if(quantity <= MED_SHAMPOO_QUANTITY) {
          return MED_SHAMPOO_COST;
      } else if(quantity <= LARGE_SHAMPOO_QUANTITY) {
          return LARGE_SHAMPOO_COST;
      } else {
          return LARGE_SHAMPOO_COST + getCost(quantity-LARGE_SHAMPOO_QUANTITY);
      }
  }

  public static void main(String[] args) throws IOException
  {	
      Scanner GLaDOS = new Scanner(new File("shampoo.dat"));
	
      int Bro = GLaDOS.nextInt();
      for(int index = 0; index < Bro; index++) {
          double quantity = 0;
          int cost = 0;
          int numSmall = GLaDOS.nextInt();
          int numMed = GLaDOS.nextInt();
          int numLarge = GLaDOS.nextInt();
          int numXLarge = GLaDOS.nextInt();

          quantity = (double)(numSmall*SMALL_DOG_QUANTITY) + 
                             (numMed*MED_DOG_QUANTITY)     + 
                             (numLarge*LARGE_DOG_QUANTITY) + 
                             (numXLarge*XLARGE_DOG_QUANTITY);
          cost = getCost(quantity);  
          System.out.println("$" + cost);
      }
      GLaDOS.close();
  }
}



import java.util.Scanner;

public class MilkVendor {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      
      System.out.print("Enter the quantity of milk purchased in liters: ");
      double milk = sc.nextDouble();
      double total_milk=milk+milk/4;

      
      double costPrice = 3.25 * milk;

      
      double sellingPrice = 4.15 * total_milk;

      
      double profit = sellingPrice - costPrice;

      System.out.printf("The profit for the milk vendor is: %.2f/-", profit);
   }
}

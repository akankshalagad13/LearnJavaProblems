import java.util.Scanner;
//Write a program which accepts the amount in dollars and convert into rupees?

public class Dollars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the amount in dollars:");
        double amt=sc.nextDouble();
        double rupees=amt*82.5775;
        System.out.println("amount in rupees:"+amt);
    }
    
}

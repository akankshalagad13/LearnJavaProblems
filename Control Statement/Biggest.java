import java.util.Scanner;

public class Biggest {
    //Write a program to find biggest of given three numbers?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number is:");
        int a=sc.nextInt();
        System.out.println("enter the second number is:");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("the first number a is greater");
        }
        else if(b>c && b>a){
            System.out.println("the number b is greater");
        }
        else
        System.out.println("the number c is greater");
       
  
    }
    
}

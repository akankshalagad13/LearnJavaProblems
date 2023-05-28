import java.util.Scanner;

public class Interchange {
    //Two numbers are input into two locations ‘a’ and ‘b’
    // Write a program to interchange the contents of ‘a’ and ‘b’ 
    //without using temporary variables?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number a:");//4
        int a=sc.nextInt();
        System.out.println("enter the numebr b");//2
        int b=sc.nextInt();
        a=a+b;//4+2,a=6
        b=a-b;//6-2 b=4
        a=a-b;//6-4 a=2
        System.out.println("new values");
        System.out.println("a"+ " "+a);
        System.out.println("b"+ " "+b);
        
    }
    
}

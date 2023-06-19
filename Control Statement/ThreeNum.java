import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ThreeNum {
    //Take three numbers from the user and print the greatest number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the a:");
        a=sc.nextInt();
        System.out.println("enter the b:");
        b=sc.nextInt();
        System.out.println("enter the c:");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c &&b>a){
            System.out.println(b);
        }
        else 
        {
            System.out.println(c);
        }

        

        
    }
    
}

import java.util.Scanner;

public class Calculation1 {
    Calculation1(){
     int a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number a nad b");
     a=sc.nextInt();
     b=sc.nextInt();
     int add=a+b;
     System.out.println("addition:"+add);
     int sub=a-b;
     System.out.println("subtraction="+sub);
     int multi=a*b;
     System.out.println("multiplication:"+multi);
     int div=a/b;
     System.out.println("division:"+div);

    }
    public static void main(String[] args) {
        Calculation1 obj=new Calculation1();
        
    }
    
}


    import java.util.Scanner;
public class Calculation2 {
    Calculation2(int a,int b){
     Scanner sc=new Scanner(System.in);
     int add=a+b;
     System.out.println("addition:"+add);
     int sub=a-b;
     System.out.println("subtraction="+sub);
     int multi=a*b;
     System.out.println("multiplication:"+multi);
     int div=a/b;
     System.out.println("division:"+div);

    }
    public void display(){
        System.out.println();
    }
    public static void main(String[] args) {
        Calculation2 obj=new Calculation2(5,4);
        
    }
    
}


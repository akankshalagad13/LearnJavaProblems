import java.util.Scanner;

public class Employees {  
    Employees()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the emlpyees Id");
        int employees_id=sc.nextInt();
        System.out.println("enter the emlpyees name");
        
        String name=sc.next();
        System.out.println("enter the emlpyees mail");
        String mail=sc.next();
    }
    public static void main(String[] args) {
        Employees obj=new Employees();
        
    }
    
}

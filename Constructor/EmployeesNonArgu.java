 import java.util.Scanner;

public class EmployeesNonArgu{  
    EmployeesNonArgu(int employees_id, String name, String mail)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the emlpyees Id");
        employees_id=sc.nextInt();
        System.out.println("enter the emlpyees name");
        name=sc.next();
        System.out.println("enter the emlpyees mail");
        mail=sc.next(); 
    }
    public void Display(){
        System.out.println();
    }
    public static void main(String[] args) {
        EmployeesNonArgu obj=new EmployeesNonArgu(11,"akash","fsfgd");
        
    }
    
}

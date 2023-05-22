import java.util.Scanner;
class Salary{
int salary;
double ta,hra,da;
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary:");
salary=sc.nextInt();
ta=salary*0.2;
hra=salary*0.2;
da=salary*0.3;
int gross=salary+ta+hra+da;
System.out.println("gross salary:"+gross);

}


}

import java.util.Scanner;
//Rajesh’s basic salary is input through the keyboard. 
//His D.A. is 40% of basic salary, and H.R.A. is 20% of basic salary. 
//Write a program to calculate his gross salary ?
class Salary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary:");
int salary=sc.nextInt();
double ta=salary*0.2;
double hra=salary*0.2;
double da=salary*0.3;
double gross=salary+ta+hra+da;
System.out.println("gross salary:"+gross);

}


}

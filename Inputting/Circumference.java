import java.util.Scanner;
class Circumference{
public static void main(String args[])
{
int r;
double C;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
r=sc.nextInt();

C=2*3.14*r;
System.out.println("circumference of circle:"+ C);
}
}
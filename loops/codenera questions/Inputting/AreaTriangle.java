import java.util.Scanner;
class AreaTriangle{
public static void main(String args[])
{
int b;
int h;
float A;
Scanner sc=new Scanner(System.in);
System.out.println("enter the breadth");
b=sc.nextInt();
System.out.println("enter the height:");
h=sc.nextInt();
A=(b*h)/2;

System.out.println("Area of triangle:"+ A);
}
}
import java.util.Scanner;
class PeriRectangle{
public static void main(String args[])
{
int l;
int b;
int p;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
l=sc.nextInt();
System.out.println("enter the breadth:");
b=sc.nextInt();

p=2*(l+b);

System.out.println("perimeter of rectangle:"+ p);
}
}
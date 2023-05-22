import java.util.Scanner;
class Rectangle{
public static void main(String args[])
{
int length;
int breadth;
int area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
length=sc.nextInt();
System.out.println("enter the breadth:");
breadth=sc.nextInt();
area=length*breadth;

System.out.println("area of rectangle:"+area);
}
}
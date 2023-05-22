import java.util.Scanner;
class Perimeter{
public static void main(String args[])
{
int radius;
double perimeter;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
radius=sc.nextInt();
perimeter=4*radius;

System.out.println("area of Circle:"+ perimeter);
}
}
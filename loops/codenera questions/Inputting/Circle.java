import java.util.Scanner;
class Circle{
public static void main(String args[])
{
int radius;
double area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
radius=sc.nextInt();
area=3.14*radius*radius;

System.out.println("area of Circle:"+area);
}
}
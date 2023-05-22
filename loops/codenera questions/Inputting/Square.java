import java.util.Scanner;
class Square{
public static void main(String args[])
{
int length;
int area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length:");
length=sc.nextInt();
area=length*length;

System.out.println("area of Square:"+area);
}
}
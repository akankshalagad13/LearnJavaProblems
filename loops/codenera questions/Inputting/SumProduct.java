import java.util.Scanner;
class SumProduct{
public static void main(String args[])
{
int a,b;
int sum;
int product;
Scanner sc=new Scanner(System.in);
System.out.println("enter the a");
a=sc.nextInt();
System.out.println("enter the b:");
b=sc.nextInt();
sum=a+b;
product=a*b;

System.out.println("Total Sum:"+sum);
System.out.println("Total Product:"+product);
}
}
import java.util.Scanner;
class FourInput{
public static void main(String args[])
{
int a,b,c,d;
int mul;
Scanner sc=new Scanner(System.in);
System.out.println("enter the a");
a=sc.nextInt();
System.out.println("enter the b:");
b=sc.nextInt();
System.out.println("enter the c:");
c=sc.nextInt();
System.out.println("enter the d:");
d=sc.nextInt();
mul=a*b;
int SumLastTwo=c+d;
int Sub=SumLastTwo-mul;

System.out.println("mul of first two number:"+mul);
System.out.println("Sum of last two number:"+ SumLastTwo);
System.out.println("Subtract the mul from sum of last two numbers:"+ Sub);
}
}
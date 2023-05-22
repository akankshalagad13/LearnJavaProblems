import java.util.Scanner;
class FiveInputA{
public static void main(String args[])
{
int a,b,c,d,e;
int avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the a:");
a=sc.nextInt();
System.out.println("enter the b:");
b=sc.nextInt();
System.out.println("enter the c");
c=sc.nextInt();
System.out.println("enter the d");
d=sc.nextInt();
System.out.println("enter the e");
e=sc.nextInt();
int sum=a+b+c+d+e;
avg=sum/5;

System.out.println("sum of five input:"+ sum);
System.out.println("average:"+avg);
}
}
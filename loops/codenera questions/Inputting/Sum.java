import java.util.Scanner;
class Sum{
public static void main(String args[])
{
int a,b,c,d,e;
int sum;

Scanner sc=new Scanner(System.in);
System.out.println("enter the a");
a=sc.nextInt();
System.out.println("enter the b:");
b=sc.nextInt();
System.out.println("enter the c:");
c=sc.nextInt();
System.out.println("enter the d:");
d=sc.nextInt();
System.out.println("enter the e:");
e=sc.nextInt();
sum=a+b+c+d+e;

System.out.println("Total Sum:"+sum);
}
}
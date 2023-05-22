import java.util.Scanner;
class SixInput{
public static void main(String args[])
{
int a,b,c,d,e,f;
int sum;
int avg;
int res;
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
System.out.println("enter the f");
f=sc.nextInt();
sum=a+b+c;
System.out.println("sum of first three input:"+ sum);
int lastThree=d+e+f;
avg=lastThree/3;
System.out.println("avg of last three:"+ avg);
res=sum+avg;

System.out.println("result:"+ res);
}
}
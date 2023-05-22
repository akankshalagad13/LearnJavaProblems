import java.util.Scanner;
class SimpleInterest{
public static void main(String args[])
{
int amount;
int rate;
int time;
Scanner sc=new Scanner(System.in);
System.out.println("enter the amount");
amount=sc.nextInt();
System.out.println("enter the rate:");
rate=sc.nextInt();
System.out.println("enter the time");
time=sc.nextInt();
int SI=rate*amount*time;

System.out.println("Simple interest:"+ SI);
}
}
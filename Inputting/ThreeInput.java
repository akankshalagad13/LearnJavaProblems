import java.util.Scanner;
class ThreeInput{
public static void main(String args[])
{
int a,b,c;
int add;
Scanner sc=new Scanner(System.in);
System.out.println("enter the a");
a=sc.nextInt();
System.out.println("enter the b:");
b=sc.nextInt();
System.out.println("enter the c:");
c=sc.nextInt();
add=a+b;
int res=add-c;

System.out.println("sum of a nd b:"+add);
System.out.println("result:"+ res);
}
}
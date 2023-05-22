import java.util.Scanner;
class Number5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=1;
int count=0;
int sum=0;
while(num<=n)
{
if(num%2!=0){
count++;
sum=sum+num;}
num++;}
System.out.println("count of odd numbers:"+count);
System.out.println("sum of odd numbers:"+sum);
}
}
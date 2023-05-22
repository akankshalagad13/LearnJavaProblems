import java.util.Scanner;
class Number2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int first=sc.nextInt();
int last=sc.nextInt();
while(first<=last)
{
if(first%2==0){
System.out.println(first);}
first++;
}
}}
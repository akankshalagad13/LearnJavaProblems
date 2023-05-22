import java.util.Scanner;
class Palindrome{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int rem,rev=0,temp;
temp=n;
while(temp!=0){
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(n==rev){
System.out.println("palindrome");}
else
System.out.println("not palindrome");
}}

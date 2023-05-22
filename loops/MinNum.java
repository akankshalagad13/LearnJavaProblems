import java.util.Scanner;
class MinNum{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int max=0,rem;
while(n!=0){
rem=n%10;
if(rem<max){
max=rem;
}
n=n/10;}
System.out.println(max);
}}

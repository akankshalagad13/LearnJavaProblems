import java.util.Scanner;
class Factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int factorial=1;
int i=1;
while(i<=n){
factorial=factorial*i;
i++;
}
System.out.println(factorial);

}}
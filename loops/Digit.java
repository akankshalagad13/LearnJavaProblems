import java.util.Scanner;
class Digit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while(i<=n){
if(n%2==0){
System.out.println("even");}
else
System.out.println("odd");
i++;
}

}}
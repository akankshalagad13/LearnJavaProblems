
//Write a program to find out the given number is odd or even?
import java.util.Scanner;
class EvenOdd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a num1:");
int num1=sc.nextInt();
String res=(num1%2==0)?"even":"odd";
System.out.println(res);

}
}
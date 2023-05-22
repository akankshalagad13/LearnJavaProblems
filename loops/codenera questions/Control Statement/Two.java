

import java.util.Scanner;
class Two{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a num1:");
int num1=sc.nextInt();
System.out.println("enter a num 2:");
int num2=sc.nextInt();
String res=(num1>num2)?"max":"min";
System.out.println(res);

}
}
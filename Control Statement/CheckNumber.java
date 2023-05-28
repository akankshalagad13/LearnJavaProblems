import java.util.Scanner;
//Write a program to check whether the given number is positive or negative?
class CheckNumber{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
if(n>=0){
System.out.println("positive");
}
else{
System.out.println("Negative");
}

}
}
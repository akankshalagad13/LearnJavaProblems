import java.util.Scanner;
class GreaterSmaller{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number A:");
int a=sc.nextInt();
System.out.println("Enter the number B:");
int b=sc.nextInt();

if(a>b){
System.out.println("a is greater");
}
else{
System.out.println("smaller");
}

}
}
import java.util.Scanner;
class GretestAmongThree{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number A:");
int a=sc.nextInt();
System.out.println("Enter the number B:");
int b=sc.nextInt();
System.out.println("Enter the number C:");
int c=sc.nextInt();
if(a>b&&a>c){
System.out.println("a is greater");
}
else if(b>a&&b>c){
System.out.println("b is greater");
}
else{
System.out.println("C is greater");
}

}
}
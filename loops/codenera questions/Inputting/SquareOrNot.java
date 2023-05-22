import java.util.Scanner;
class SquareOrNot{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number l:");
int l=sc.nextInt();
System.out.println("Enter the number b:");
int b=sc.nextInt();

if(l==b){
System.out.println("it is a square");
}
else{
System.out.println("it is not a square");
}

}
}
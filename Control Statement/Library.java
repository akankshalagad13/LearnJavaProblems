import java.util.Scanner;
class Library{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int days;
double fine;
System.out.println("enter the no.of days:");
days=sc.nextInt();
if(days>0 && days<=5){
fine=days*0.50;
System.out.println("fine is"+fine);
}
else if(days>6 && days <=10){
fine=days*1;
System.out.println("fine is:"+fine);
}
else if(days<=10){
fine=days*5;
System.out.println("fine is:"+fine);
}
else if(days>=30){
System.out.println("memebrship will be cancelled");
}
}
}
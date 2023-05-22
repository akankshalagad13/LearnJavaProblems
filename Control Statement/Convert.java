import java.util.Scanner;
class Convert{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of seconds:");
int seconds=sc.nextInt();
int hours=seconds/60;
int minutes=(seconds%3600)/60;
int remainingSec=seconds%60;
System.out.println(hours+"hours,"+minutes+"minutes,"+remainingSec+"remainingSec,");
}
}
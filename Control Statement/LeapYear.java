import java.util.Scanner;
//Write a program to check whether the given year is leap year or not?

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("year is leap year");
        }
        else
        System.out.println("not leap year");

    }
    
}

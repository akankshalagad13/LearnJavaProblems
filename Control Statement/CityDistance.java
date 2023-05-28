import java.util.Scanner;

public class CityDistance {
    //The distance between two cities in Km. is input through the keyboard. 
    //Write a program to convert and print the result in meters and centimeters?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the distance between tow cities:");
        int d=sc.nextInt();
        int meter=d*1000;
        int centimeter=meter*1000;
        System.out.println("distance in meter and centimeter is: " + meter + " m  "+centimeter + " cm ");
        
    }
    
}

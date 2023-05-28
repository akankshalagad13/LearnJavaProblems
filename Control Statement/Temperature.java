import java.util.Scanner;
//The temperature of the city is input through the keyboard in Fahrenheit.
// Write a program to convert into Celsius?

public class Temperature {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the temperature in ferenhit:");
        double ferenhit=sc.nextDouble();
        double celcius=((ferenhit-32)*5)/9;
        System.out.println("temperature in celcius is:"+celcius);

    }
    
}

import java.util.Scanner;

public class WeekDay {
    // Write a Java program that keeps a number
    // from the user and generates an integer between
   // 1 and 7
    //and displays the name of the weekday.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        switch(num){
            case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednsday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
            System.out.println("number enter is wrong.");
        }
    }
    
}

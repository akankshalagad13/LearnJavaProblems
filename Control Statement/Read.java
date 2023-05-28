import java.util.Scanner;

public class Read {
    // Write a program to read the marks of 3 subjects and display the total, avg, class?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("marks of first subject:");
        int first=sc.nextInt();
        System.out.println("marks of second subject:");
        int second=sc.nextInt();
        System.out.println("marks of third subject:");
        int third=sc.nextInt();
        int total=first+second+third;
        System.out.println("the total of all subject is: "+ total);
        int avg=total/3;
        System.out.println("the avg of subject is: "+avg);
        if(total>=80){
            System.out.println("class is A");
        }
        else
        System.out.println("class is B");
    }
    
}

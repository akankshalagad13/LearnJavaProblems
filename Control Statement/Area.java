import java.util.Scanner;

public class Area {
    //Write a program to print the area of triangle if b and h values are given?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("breadth=");
        int b=sc.nextInt();
        System.out.println("height:");
        int h=sc.nextInt();
        int areaofTriangle=(b*h)/3;
        System.out.println("area of triangle is:"+ areaofTriangle);

        
    }
    
}

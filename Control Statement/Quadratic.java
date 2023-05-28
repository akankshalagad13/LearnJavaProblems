import java.util.Scanner;

public class Quadratic {
    //Write a program to find the roots of a given quadratic equation 
    //and print the nature of roots?

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coefficieant of first term:");
        double a=sc.nextDouble();
        System.out.println("enter the coefficieant of second term:");
        double b=sc.nextDouble();
        System.out.println("enter the coefficieant of constant term:");
        double c=sc.nextDouble();
        double delta=b*b-4*a*c;
        if(delta>0){
            double root1=(-b+Math.sqrt(delta))/(2*a);
            double root2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("root1 is :"+ root1);
            System.out.println("root2 is:"+root2);
            System.out.println("nature of root is real and different");
        }
        else if(delta==0){
            double root1=-b/(2*a);
            System.out.println("root1 is :"+ root1);
            System.out.println("nature of root is real and equal");

        }
        else{
            double root1=-b/(2*a);
           
            System.out.println("root1 is :"+ root1);


            System.out.println("nature of root is imaginary");
        }

    }
    
}

import java.util.Scanner;

public class Sum {
    //Write a program to read ten numbers and print their sum by using ’if’ statement
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements numbers:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }    
        int sum=0;
        for(int j=0;j<size;j++){
            sum=sum+arr[j];
            
        }System.out.println("the sum is:"+sum);
        
    }
    
}

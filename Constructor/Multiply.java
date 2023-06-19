import java.util.Scanner;

public class Multiply {
    //WAP input 10 elements and multiply 5th elements by 25.
    Scanner sc=new Scanner(System.in);
    Multiply(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void display(int size,int arr[]){
        int mul=arr[5]*25;
        System.out.println("Multiplication is:"+mul);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        Multiply m=new Multiply(size, arr);
        m.display(size, arr);

        
    }
    
}

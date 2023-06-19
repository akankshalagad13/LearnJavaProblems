import java.util.Scanner;

public class PrintArray {
    Scanner sc=new Scanner(System.in);
    PrintArray(int size,int arr[]){
        System.out.println("enter a array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

    }
    public void display(int size,int arr[]){
        System.out.println("print element array:");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        PrintArray pa=new PrintArray(size, arr);
        pa.display(size, arr);;
        
    }
    
}

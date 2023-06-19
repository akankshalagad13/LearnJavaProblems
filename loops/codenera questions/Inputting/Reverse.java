import java.util.Scanner;

public class Reverse{
    Reverse(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reverse array:");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }System.out.println();


    }
    public void display(){
        System.out.println();

    }
    public static void main(String[] args) {
        Reverse obj=new Reverse();
        
    }
}
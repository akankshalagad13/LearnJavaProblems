import java.util.Scanner;
//Wap enter an array and print it in reverse order.

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt(); 
        System.out.println("enter the elemnts:");
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
    
}

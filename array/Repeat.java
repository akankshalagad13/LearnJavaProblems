import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elment in array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int count=0;
        for(int j=0;j<size;j++){
            if(arr[j]==num){
                count=count+1;
            } 
        }
        System.out.println("count is:"+count);
    }
    
}

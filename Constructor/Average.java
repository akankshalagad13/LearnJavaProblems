import java.util.Scanner;

public class Average {
    //Wap to input an array and find its average of first 5 element.
    Scanner sc=new Scanner(System.in);
    Average(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
    }
    public void display(int size,int arr[]){
        int i;
        int sum=0;
        int avg=0;
        for(i=0;i<=5;i++){
            sum=sum+i;
            avg=sum/5;
        }
        System.out.println("average is:"+avg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        Average a=new Average(size, arr);
        a.display(size, arr);

        
    }
    
}

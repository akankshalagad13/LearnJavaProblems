
    import java.util.Scanner;
//Wap enter an array and search any two element and print the result.
public class TwoSearch {
    Scanner sc=new Scanner(System.in);
    TwoSearch(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void display(int size,int arr[]){
        System.out.println("enter a elemnt:");
        int num=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("two elments are:"+num+" "+num2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        TwoSearch s=new TwoSearch(size, arr);
        s.display(size, arr);
    }
    
}

    

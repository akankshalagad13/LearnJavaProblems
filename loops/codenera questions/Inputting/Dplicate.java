import java.util.Scanner;

public class Duplicate{
    Duplicate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                if(arr[j]==arr[k]);
            }
            System.out.println("duplicate elements are"+arr[k]);

        }
    }
    public static void main(String[] args) {
        Duplicate obj=new Duplicate();
        
    }
}
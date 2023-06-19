import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr1[]=new int[size];
        for(i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the elements:");
        int arr2[]=new int[size];
        for(j=0;j<size;j++){
            arr2[j]=sc.nextInt();
        }
        int sum[]=new int[size];
        for(int k=0;k<size;k++){
           sum[k]=arr1[k]+arr2[k];
        }
        for(int k=0;k<size;k++){
            System.out.println(sum[k]);
        }

        
    }
    
}

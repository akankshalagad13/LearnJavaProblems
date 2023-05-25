import java.util.Scanner;

public class Peak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elment in array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<arr.length-1;j++){
            if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                System.out.println(arr[j]+" ");
            }
        }
    }
    
}

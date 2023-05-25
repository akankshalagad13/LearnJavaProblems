import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elment in array:");
        System.out.println("result:");
        int j,m,k;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for( j=0;j<size;j++){
            if(arr[j]==0){
                System.out.println(arr[j]);
            }
        }
        for( k=1;k<size;k++){
            if(arr[k]==1){
                System.out.println(arr[k]);
            }
        }
        for(m=2;m<size;m++){
            if(arr[m]==0){
                System.out.println(arr[m]);
            }
        }
        //System.out.println(arr[j]+arr[k]+arr[m]);


    }
    
}

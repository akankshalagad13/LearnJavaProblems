import java.util.Scanner;

public class Dublicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elments:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                
                if(arr[j]==arr[k]){
                    System.out.println("eneter the dublicate elements:"+arr[k]);
                    count=count+1;
                }
            }
        }
        System.out.println("the count is:"+count);
    }
    
}

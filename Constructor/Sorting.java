import java.util.Scanner;

public class Sorting {
    private int[]arr;
    private int size;
    Sorting(int arr[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int [size];
    
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void display(){ 
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                int temp=0;
                if(arr[j]>arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
            }
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
        }
    
    public static void main(String[] args) {
        
        Sorting obj=new Sorting(int arr[],int size);
        obj.display();
        
    }
    
}

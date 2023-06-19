import java.util.Scanner;

public class Large{
    Scanner sc=new Scanner(System.in);
     Large(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        }
        public void display(int size,int arr[]){
            System.out.println("array elements are:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);  
            }
            int max=arr[0];
            int min=arr[0];
            for(int i=0;i<size;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("maximum"+max);
            for(int j=0;j<size;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            System.out.println("Minimum"+min);
            
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        Large obj=new Large(size, arr);
        obj.display(size, arr);

       
    }
}
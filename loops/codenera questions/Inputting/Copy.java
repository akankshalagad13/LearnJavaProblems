import java.util.Scanner;
public class Copy
{
     Scanner sc=new Scanner(System.in);
    Copy(int size,int arr[])//formal argument
    {
       
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();   
        }
    }
    public void display(int size,int arr[])//formal argument
    {
      
        System.out.println("reverse array:");
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]+" ");
        }
        System.out.println();

    }
    
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        Copy c=new Copy(size, arr);
        c.display(size, arr);

        
    }
}
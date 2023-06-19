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
        
        for(int j=0;j<size;j++){
            int count=0;
            for(int k=j+1;k<size;k++){
                if(arr[j]==arr[k])
{
count++;
}
            }
if(count==0)
{
            System.out.println("arr[j]);
}
        }
    }
    public static void main(String[] args) {
        Duplicate obj=new Duplicate();
        
    }
}
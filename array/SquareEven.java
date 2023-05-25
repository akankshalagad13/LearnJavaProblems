import java.util.Scanner;
//Wap enter an array and print the square of the element which is on odd position.

public class SquareEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the size:");
        int size=sc.nextInt();
        System.out.println("enter the elments:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            if(j%2==0){
                arr[j]=arr[j]*arr[j];{
                  System.out.println("the elments at even position:"+arr[j]);
                }                      
            }

            
        }
    }
    
}


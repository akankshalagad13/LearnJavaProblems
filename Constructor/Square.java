
    import java.util.Scanner;
//.Wap enter an array and print the square of the element which is present at odd position.
public class Square {
    Scanner sc=new Scanner(System.in);
    Square(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void display(int size,int arr[]){
         for(int j=0;j<size;j++){
            if(j%2==1){
                arr[j]=arr[j]*arr[j];{
                  System.out.println("the elments at odd position:"+arr[j]);
                }                      
            }

            
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        Square s=new Square(size, arr);
        s.display(size, arr);
    }
    
}

    

    


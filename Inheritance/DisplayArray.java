import java.util.Scanner;

class Elements{
    int size;
    int arr[];
    public void Number(){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the size:");
    size=sc.nextInt();
    System.out.println("enter the elements:");
     arr=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    }
    
}
class display extends Elements
{
   public void disp()
   {
    System.out.println("dispplaying methods");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
   }
}
public class DisplayArray{
    public static void main(String[] args) {
        display d=new display();
        d.Number();
        d.disp();

        
    }
}
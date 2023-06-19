import java.util.Scanner;
//Wap enter an array and search any particular element.want to search element 3

public class Searching {
    Scanner sc=new Scanner(System.in);
    Searching(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void display(int size,int arr[]){
        for(int j=0;j<size;j++){
            if(arr[j]==3){
                System.out.println("element is searched");
            }
            else{
                System.out.println("not searched");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        Searching s=new Searching(size, arr);
        s.display(size, arr);
    }
    
}

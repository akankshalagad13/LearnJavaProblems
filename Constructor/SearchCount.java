
    import java.util.Scanner;
//Wap enter an array and search any particular element and found the count of that.

public class SearchCount {
    Scanner sc=new Scanner(System.in);
    SearchCount(int size,int arr[]){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void display(int size,int arr[]){
        System.out.println("enter a elemnt:");
        int num=sc.nextInt();
        int count=0;
        for(int j=0;j<size;j++){
            if(arr[j]==num){
                count=count+1;
            }
        }
        System.out.println("the count is:"+count);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[size];
        SearchCount s=new SearchCount(size, arr);
        s.display(size, arr);
    }
    
}

    

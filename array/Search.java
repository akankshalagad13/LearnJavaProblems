import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int p=0;p<size;p++){
          arr[p]=sc.nextInt();
        }
        System.out.println("enter a serching element:");
        int num=sc.nextInt();
        int count=0;
        for(int q=0;q<size;q++){
            if(arr[q]==num){
                count=count+1;
            }
        }
        System.out.println("count is:"+count);
    }
}

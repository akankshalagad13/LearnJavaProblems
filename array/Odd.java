import java.util.Scanner;
//.Wap enter an array and find the sum and count of odd element .
class Odd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        int k=1;
        while(k<size){
            sum=sum+arr[k];
            count=count+1;
            k=k+2;
        }
        System.out.println("sum is:"+sum);
        System.out.println("count is:"+count);

    }
}
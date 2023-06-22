import java.util.Scanner;
//wap enter an array and find the sum and count of element present at even position
class Array1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
       
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int count=0;
        int j=1;
        while(j<size){
            sum=sum+arr[j];
            j=j+2;
            count=count+1;

        }
        System.out.println("sum is:"+sum);
        System.out.println("count is:"+count);

        }
}
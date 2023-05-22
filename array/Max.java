import java.util.Scanner;

class Max{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array element:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i;
        int j;
        System.out.println("Enter an array element:");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element are:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value:"+max);

    }
}
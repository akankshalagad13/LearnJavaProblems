
//WAP to replace all negative value with its immediate left elements square. Means 
public class Negative {
    public static void main(String[] args) {
       int arr[]={12, 3, -19, 29, 5, -61, 44, 7, -9};
       for(int i=1;i<arr.length;i++) {
        if(arr[i]<0){
            arr[i]=arr[i-1]*arr[i-1];   
        }
       }
       System.out.println("new array:");
       for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]+" ");
       }
       System.out.println();


    }
    
}

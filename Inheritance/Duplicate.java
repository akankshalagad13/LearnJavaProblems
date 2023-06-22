//Find the duplicate from the elements Size of array will be 10; 
 //input in constructor and final result through the method. 

import java.util.Scanner;

class DuplicateArray{
    Scanner sc=new Scanner(System.in);
    int size;
    int arr[];
    public void element(){
	System.out.println("enter size");
        size=sc.nextInt();
        arr=new int[size];
    System.out.println("enter elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void disp(){
        System.out.println("original array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
class DuplicateArray2 extends DuplicateArray{
    public void dupli(){
        
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                if(arr[j]==arr[k])
                {
                                    System.out.println("duplicate elments are:"+arr[k]);

                }
            }
        }
    }
    
}
public class Duplicate {
    public static void main(String[] args) {
        DuplicateArray2 da=new DuplicateArray2();
        da.element();
        da.disp();
        da.dupli();

        
    }
    
}

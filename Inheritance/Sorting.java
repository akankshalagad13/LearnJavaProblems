//Write a program to sort the 10 elements from array. 
 //input in constructor and final result through the method. 

import java.util.Scanner;

class SortArray{
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
System.out.println("origin array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
class SortArray2 extends SortArray{
    public void sort(){
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                int temp=0;
                if(arr[j]>arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;

                }
            }
        }
System.out.println("after sorting");
        for(int m=0;m<size;m++){
            System.out.println(arr[m]);
        }
    }
}
 public class Sorting {
    public static void main(String[] args) {
        SortArray2 sa=new SortArray2();
        sa.element();
        sa.disp();
        sa.sort();
        
    }
    
}

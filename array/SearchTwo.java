import java.util.Scanner;

public class SearchTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int h=0;h<size;h++){
            arr[h]=sc.nextInt();
        }
        System.out.println("eneter the two elements a and b:");
        int a=sc.nextInt();
        System.out.println(" ");
        int b=sc.nextInt();
        int m=0;
        boolean afound=false;
        boolean bfound=false;

        while(m<size){
        
            if(arr[m]==a){
                afound=true;   
            }
            if(arr[m]==b){
                bfound=true;
            }
            m=m+1;
        }
        if(afound && bfound){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }


    }
    
}

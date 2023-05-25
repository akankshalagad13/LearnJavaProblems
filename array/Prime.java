import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter a first number:");
        int a=sc.nextInt();
        System.out.println("enetr a last number:");
        int b=sc.nextInt();
        int j;
        for(int i=a;i<=b;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                    
                }
            }
            if(i==j){
                System.out.println(i);
            }


        }

    }
    
}

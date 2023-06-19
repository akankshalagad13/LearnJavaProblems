import java.util.Scanner;

public class Palindrome {
    Palindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int rem,rev=0,temp;
        temp=num;
        while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
     }
    if(num==rev){
    System.out.println("palindrome");}
    else
    System.out.println("not palindrome");
    }
    
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        
    }
    
}

import java.util.Scanner;

public class PalindromeNoArgu{
    PalindromeNoArgu(int num){
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
    public void display(){
        System.out.println();
    }
    
    public static void main(String[] args) {
        PalindromeNoArgu obj=new PalindromeNoArgu(454);
        
    }
    
}

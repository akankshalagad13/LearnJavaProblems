public class Palindrome {
    public static void main(String[] args) {
        int f=1,l=100,i,j,rev,rem;
        for(i=f;i<=l;i++){
            rev=0;
            for(j=i;j!=0;j=j/10){
                rem=j%10;
                rev=rev*10+rem;
            }
            if(i==rev){
                System.out.println(i+" ");
            }
        }
    }
}
    

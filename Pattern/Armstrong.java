public class Armstrong {
    public static void main(String[] args) {
        int i,j;
        int n=152;
        int rem,sum=0;
        for(i=n;i!=0;i=i/10){
            rem=i%10;
            sum=sum+(rem*rem*rem);
        }
        if(n==sum){
            System.out.println("number is armstrong");
        }
        else
        System.out.println("not armstrong number");
    }
    
}

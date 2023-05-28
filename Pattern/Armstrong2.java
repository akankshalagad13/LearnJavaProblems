public class Armstrong2 {
    public static void main(String[] args) {
        int i,j;
        int n=1,l=1000;
        int rem,sum=0;
        for(j=n;j<=l;j++){
            sum=0;
            for(i=j;i!=0;i=i/10){
                rem=i%10;
                sum=sum+(rem*rem*rem);

            }
            if(j==sum){
                System.out.println(j);
            }
        }
    }
    
}

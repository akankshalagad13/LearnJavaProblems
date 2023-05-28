public class Prime {
    public static void main(String[] args) {
        int i,j;
        int f=10,l=100;
        for(i=f;i<=l;i++){
            int c=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(i+" ");
            }
        }
    }
    
}

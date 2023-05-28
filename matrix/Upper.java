public class Upper {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int a[][]={{1,1,1},{0,1,1},{0,0,1}};
        int flag=1;
        int i,j;
        System.out.println("original matrix:");
        for(i=0;i<a.length;i++){
            for(j=0;j<i;j++){
                if(a[i][j]!=0){
                    flag=0;
                }
            }
        }
        if(flag==1){
            System.out.println("upper");
        }
        else
        System.out.println("not upper");
       }
    
}

public class Identity {
    public static void main(String[] args) {
        int col=3;
        int row=3;
        int i,j;
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        boolean flag=true;
        System.out.println("original matrix:");
        for( i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                //System.out.print(a[i][j]);
                if(a[i][j]!=1 && a[j][i]!=0)
                flag=false;
                break;

            }
        }
        if(flag){
            System.out.println("identity");
        }
        else{
            System.out.println("not identity");
        }
        
         
    }
    
    }

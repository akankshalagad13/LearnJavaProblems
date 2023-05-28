public class Symmetric{
    public static void main(String[] args) {
        int row=3;
        int i,j;
        int col=3;
        int a[][]={{3,2,1},{8,6,4},{7,6,5}};
        System.out.println("original matrix:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("tarnspose matrix:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        if(row!=col){
            System.out.println("not square matrix so not possible to sysmmetric");
        }
        else{
            boolean sym=true;
            System.out.println("original matrix:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                if(a[i][j]!=a[j][i])
                sym=false;
                break;
            }
        }
        if(sym){
            System.out.println("symmetric");
        }
        else
        System.out.println("not symmetric");
        }

    }
}
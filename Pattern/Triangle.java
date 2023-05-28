public class Triangle{
    public static void main(String[] args) {
        int i,j;
        int alpha=64;
        for(i=1;i<=6;i++){
            for(j=i;j<=6;j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}
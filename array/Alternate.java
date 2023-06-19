public class Alternate {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={1,2,3,4,5};
        int c[]=new int[10];
        int value=0;
        for(int i=0;i<a.length;i++){
            c[value++]=a[i];
            c[value++]=b[a.length-i-1];

        }
        for(int i=0;i<2*a.length;i++){
            System.out.print(c[i]+" ");
        }
    }
    
}

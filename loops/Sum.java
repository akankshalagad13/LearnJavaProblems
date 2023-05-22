import java.util.Scanner;
class SumEven{
public static void main(String args[]){
int sum=0;
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int l=sc.nextInt();
for(int i=f;i<=l;i++){
if(i%2==0){
System.out.println(i);
Sum=sum+i;}System.out.println(sum);
}
}
}
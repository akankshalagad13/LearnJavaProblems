import java.util.Scanner;
class SumOdd{
public static void main(String args[]){
int sum=0;
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int l=sc.nextInt();
for(int i=f;i<=l;i++){
if(i%2==1){
sum=sum+i;
}
}System.out.println(sum);
}
}
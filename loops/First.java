import java.util.Scanner;
class First1{
public static void main(String args[]){
int sum=0;
int count=0;
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int l=sc.nextInt();
for(int i=f;i<=l;i++){
if(i%2==0){
System.out.println(i);
sum=sum+i;
count++;
}
}
System.out.println("sum="+sum);
System.out.println("count="+count);

}
}
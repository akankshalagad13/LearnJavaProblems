import java.util.Scanner;
class Even{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int l=sc.nextInt();
while(i<=l)
{
if(i%2==0){
System.out.println(i);}
i++;}
}
}
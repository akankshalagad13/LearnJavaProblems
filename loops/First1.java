import java.util.Scanner;
class Do{
public static void main(String args[]){
int sum=0;
int count=0;
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int l=sc.nextInt();
int sum=0;
int count=0;
int i=f;
do{
sum=sum+i;
count++;
i++;}
while(i<=l);
System.out.println("sum="+sum);
System.out.println("count="+count);
}
}

}
}
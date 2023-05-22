import java.util.Scanner;
class Vote{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of user:");
int age=sc.nextInt();
if(age>=18){
System.out.println("yes");
}
else{
System.out.println("No");
}

}
}
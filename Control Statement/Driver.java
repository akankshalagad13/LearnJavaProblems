class Driver{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the marital status of the driver (M for married, U for unmarried): ");
ms=sc.next().charAt(0);
char gender;
char ms;
int age;
if(ms=='M'){
System.out.println("insured");
}
else if(ms=='U'&& age>30 && gender=='m'){
System.out.println("insured");
}
else if(ms=='u'&& age>25 && gender=='f'){
System.out.println("insured");
}
else{
System.out.println(" is not insured");
}
}
}
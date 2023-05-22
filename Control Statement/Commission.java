class Commission{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
system.out
double a,amount;
double p,profit;
if(amount>50000)
{
p=a*16/100;
profit=375+p;
System.out.println(profit);
}
else if(amount<50000 && amount>=40000)
{
p=a*1.4;
profit=370+p;
System.out.println(profit);
}
else if(amount<40000 &&amount>=30000){
p=a*1.2;
profit=325+p;
System.out.println(profit);
}
else if(amount<30000 && amount>=20000){
p=a*0.9;
profit=300+p;
System.out.println(profit);
}
else if(amount<20000 && amount>=10000){
p=a*0.5;
profit=250+p;
System.out.println(profit);
}
else{
p=a*0.3;
profit=200+p;
System.out.println(profit);
}

}

}
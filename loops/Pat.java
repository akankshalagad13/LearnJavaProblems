class Pat{
public static void main(String args[])
{
int i,j;
for(i=1;i<=5;i++){

for(j=i;j<=5;j++){
System.out.print(" ");}
for(j=i;j<=5;j++){
if(j==i||j==5||i==1)
System.out.print("  *");
else
System.out.print(" ");}
System.out.println();}

}}
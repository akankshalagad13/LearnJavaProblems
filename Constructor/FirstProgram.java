
public class FirstProgram{
    int f=1,l=100;
    FirstProgram()
    {
    for(int i=f;i<=l;i++)
    {
    int count=0;
        for(int j=2;j<i;j++)
        {
        if(i%j==0){
        count++;
        break;
    }
        }
    if(count==0 && i!=1){
     System.out.println(i);
    }
    }
    }
    public static void main(String args[]){
       FirstProgram obj=new FirstProgram();
    }
    
    }
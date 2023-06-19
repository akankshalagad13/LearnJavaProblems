import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DaysMonth {
    //Write a Java program to find the number of days in a month
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int no_of_days=0;
        String Monthname=" ";
        System.out.println("enter the month number:");
        int month=sc.nextInt();
        System.out.println("enter the year:");
        int year=sc.nextInt();
        switch(month){
            case 1:
            Monthname="january";
            no_of_days=31;
            

            case 2:
            Monthname="february";
            if((year %400==0) ||((year%4==0) && (year%100!=0))){
                no_of_days=29;
            }
            else{
                no_of_days=28;
            }
            break;
            

            case 3:
            Monthname="march";
            no_of_days=31;
            
            case 4:
            Monthname="april";
            no_of_days=30;
            
            case 5:
            Monthname="may";
            no_of_days=31;
            
            case 6:
            Monthname="june";
            no_of_days=30;
            
            case 7:
            Monthname="july";
            no_of_days=31;
            
            case 8:
            Monthname="august";
            no_of_days=31;
            
            case 9:
            Monthname="september";
            no_of_days=30;
            
            case 10:
            Monthname="october";
            no_of_days=31;
            
            case 11:
            Monthname="November";
            no_of_days=30;
            
            case 12:
            Monthname="december";
            no_of_days=31;

            

        }
        System.err.println(Monthname+year+" has"+no_of_days+" days");
        

    }
    
}

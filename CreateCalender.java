package org.Calender;
import java.util.ArrayList;
import java.util.List;

public class CreateCalender {
    int year;
    boolean leap ;
    int oddDays;
    List<Month> calender;
    CreateCalender(int y){
        this.year=y;
        this.leap=isLeap(y);
        this.oddDays=oddDays(y-1);
        this.calender=create(oddDays+1, leap);
        Print.print(calender, y);
    }
    static boolean isLeap(int y){
        
        if(y%400 == 0)
            return true;
        if(y%100 == 0)
            return false;
        if(y%4 == 0)
            return true;

        return false;
    }

    private static int oddDays(int y){
        int odd=0;
        if(y>400){
           y%=400;
        }
        
        odd+=(y/100)*5;
        int rem = y-((y/100)*100);
        odd+=((rem/4)*2 + ((rem)-(rem/4)));
        
        if(odd>7){
            odd=odd-((odd/7)*7);
        }

        return odd;
    }
    static List<Month> create(int oddDays,boolean leap){
        List<Month> l=new ArrayList<>();
        for(int i=1;i<=12;i++){
           
        Month m= new Month(oddDays, i, leap);
        if(i==7 || i==8){
            oddDays=oddDays+3;
          
        }else if(i==2){
            if(leap){
                oddDays=oddDays+1;
            }
        }else if(i%2==0  && i<9){
            oddDays=oddDays+2;
        }else if(i%2!=0 && i<9) {
            oddDays=oddDays+3;
        }else if(i%2==0  && i>8){
            oddDays=oddDays+3;
        }else if(i%2!=0 && i>8) {
            oddDays=oddDays+2;
        }
        if(oddDays>=7){
            oddDays=oddDays-7;
        }
        l.add(m);
       }
       return l;
    }
    
}

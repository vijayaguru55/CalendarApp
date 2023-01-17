package org.Calender;

public class Month {
    int odd;
    String Month;
    static int monthNo;
    int limit;
    String[][] m ;
    Month(int odd,int monthNo,boolean leap){
        this.monthNo = monthNo;
        this.odd=odd;
        this.Month=getMonthName(monthNo);
        this.limit=setLimit(monthNo,leap);
        this.m=create(odd, monthNo, leap,limit);
    }
    static String[][] create(int start,int month,boolean leap,int limit){
        String[][] m ;
        if(start<=4){
           m= new String[5][7];
        }else{
            m= new String[6][7];
        }
        
        int date=1;
        
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                String dt;
                if(date<10){
                     dt=String.valueOf(date)+" ";
                }else{
                    dt=String.valueOf(date);
                }
                if(date>limit){
                    m[i][j]="  ";
                    continue;
                }
                if(j>=start && i==0){
                    m[i][j]=dt;
                    date++;
                }else if(i>0){
                    m[i][j]=String.valueOf(dt);date++;
                }else{
                    m[i][j]="  ";
                }
                
            }
        }
        return m;
    }

    static int setLimit(int month,boolean leap){
        int limit=31;
        if(month==7 || month==8){
            return limit;
           
        }else if(month==2){
            if(leap){
                limit=29;
                return limit;
            }else{
                limit=28;
                return limit;
            }
        }else if(month%2==0 && month<=8){
            limit=30;
            return limit;
        }else if(month >8 && month%2==0){
            limit=31;
            return limit;
        }else if(month >8 && month%2!=0){
            limit=30;
            return limit;
        }
        return limit;
    }

    
    static  String getMonthName(int month){
        switch(month){
            case 1:return "January   ";
            case 2:return "February  ";
            case 3:return "March     ";
            case 4:return "April     ";
            case 5:return "May       ";
            case 6:return "June      ";
            case 7:return "July      ";
            case 8:return "August    ";
            case 9:return "Sepetember";
            case 10:return "October  ";
            case 11:return "November ";
            case 12:return "December ";
        }
        return null;
    }

    
}

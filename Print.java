package org.Calender;

import java.util.List;

public class Print{
    public static void print(List<Month> l,int year){
        System.out.println("\t\t\t\t"+year+"\t\t\t\t");
        
        // for(int i=0;i<l.size();i+=3){
        //     // System.out.print("\t"+l.get(i).Month+"\t\t\t\t"+l.get(i+1).Month+"\t\t\t\t"+l.get(i+2).Month+"\n");
        //         for(int j=i;j<i+3;j++){
        //             System.out.print("\t"+l.get(j).Month+"\t");   
        //         }
        //         System.out.println();
        //         for(int m=i;m<i+3;m++){
        //             Month cm = l.get(m);
        //             for(int k=0;k<cm.m[m].length;k++)
        //                 System.out.print(cm.m[m][k]+" ");
        //         }
        //         System.out.println();
        // }
        
        for (Month month2 : l) {
            System.out.println("\t"+month2.Month+"\t");
            System.out.println("S   M   T   W   T   F   S");
            for (String[] is : month2.m) {
                
                for (String i : is) {
                    System.out.print(i+"  ");
                }
                System.out.println("\n");
            }

        }
    }
}

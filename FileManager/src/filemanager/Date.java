/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;



public class Date implements Comparable{
    
    protected int day;
    protected int month;
    protected int year;
    
    public Date(int d,int m,int y){
        day = d;
        month = m;
        year = y;
           
    }
    
    @Override
    public int compareTo(Object o){
        if(o instanceof Date){        
            Date dt = (Date) o;
        
            if(this.year > dt.year) return 1;
            else if(this.year < dt.year) return -1;
            else{
                if(this.month > dt.month) return 1;
                else if(this.month < dt.month) return -1;
                else{
                    if(this.day > dt.day) return 1;
                    else if(this.day < dt.day)return -1;
                    return 0;
                }
            }
        }
        return 0;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Date){
            Date d = (Date) o;
            return (this.day == d.day && this.month == d.month && this.year == d.year);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.day;
        hash = 31 * hash + this.month;
        hash = 31 * hash + this.year;
        return hash;
    }
    
    @Override
    public String toString(){  
        return (day+"-"+month+"-"+year);
    } 
}

/**
 *
 * @author prachidhingra
 */
//public class Date {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}
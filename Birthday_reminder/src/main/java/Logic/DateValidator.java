package Logic;
public class DateValidator
{ 
  
    static int max = 2099; 
    static int min = 1800; 
    static boolean isLeap(int year) 
    { 
        return (((year % 4 == 0) && (year % 100 != 0)) ||  (year % 400 == 0)); 
    }  
    public static boolean isValidDate(int d,  int m,int y) 
    { 
        if (y > max ||  y < min) 
            return false; 
        if (m < 1 || m > 12) 
            return false; 
        if (d < 1 || d > 31) 
            return false; 
        if (m == 2)  
        { 
            if (isLeap(y)) 
                return (d <= 29); 
            else
                return (d <= 28); 
        } 
        if (m == 4 || m == 6 ||  m == 9 || m == 11) 
            return (d <= 30); 
  
        return true; 
    } 
}
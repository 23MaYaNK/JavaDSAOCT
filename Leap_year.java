import java.util.Scanner;

public class Leap_year {
    static void year(int x)
    {
        if(x%100==0)
        {
            year_cen(x);
        }
        else
        {
            year_non_cen(x);
        }
    }
    static void year_cen(int x)
    {  
        if(x%400==0)
        {
            System.out.println("The year "+x+" is an 'Leap Year'");
        }
        else
        {
            System.out.println("The year "+x+" is not an 'Leap year'");
        }
        
    }
    static void year_non_cen(int x)
    {
        if(x%4==0)
        {
            System.out.println("The year "+x+" is an 'Leap Year'");
        }
        else
        {
            System.out.println("The year  "+x+" is not an 'Leap year'");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int yr=sc.nextInt();
        year(yr);
        sc.close();
        
    }
    
}

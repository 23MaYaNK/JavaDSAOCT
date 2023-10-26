import java.util.Scanner;

public class Positive_negative {
    static void check(double a)
    {
    if(a<0)
    {
        System.out.println(a+" is negative");
    }
    else
    {
        System.out.println(a+"  is positive");
    }
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value:");
        double a=sc.nextDouble();
        check(a);
        
        sc.close();
    }
    
}

import java.util.Scanner;

public class Simple_Interest
{
    static void SI (double x,double y, double t)
    {
     double amount;
     amount=(x*t*y)/100;
     System.out.println("The Finale Amount after applying the Simple Interest is==>"+amount);

    }

public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the amount:");
        double amt=sc.nextDouble();
        System.out.println("enter the interest:");
        double inter=sc.nextDouble();
        System.out.println("enter the time:");
        double time=sc.nextDouble(); SI(amt,inter,time);
        sc.close();


    
}
}

import java.util.Scanner;

public class Positive_Neg {
    static void check(double x)
    {
        if(x<0)
        System.out.println("Number is 'Negative'");
        else 
        System.out.println("Number is 'Negative'");}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        double  n=sc.nextDouble();
        check(n);
        sc.close();
    }
    
}

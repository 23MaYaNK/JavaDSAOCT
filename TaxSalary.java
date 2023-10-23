import java.util.Scanner;
public class TaxSalary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your salary:-->");
        double sal=scan.nextDouble();
        
        
        
        if(sal<10000.0)
        {
            System.out.println("NO tax is there for your salary amount:");
           System.out.println(", Your net salary is:"+sal);
        }
        else if(10000< sal || sal <=20000 )
                {
                    double tax=sal*(10/100);
                    sal=sal-tax; 
                    System.out.println(",your net salary after tax  of 10% implementation is :"+sal);
                }
        else if(20001<= sal || sal <=30000)
                {
                    double tax=sal*(15/100);
                    sal=sal-tax; System.out.println(",your net salary after tax of 15% implementation is :"+sal);
                }
        else if(30001<=sal)
                {
                    double tax=sal*(25/100);
                    sal=sal-tax; System.out.println( ", your net salary after tax of 25% implementation is :"+sal);
                }
scan.close();
    }
    
}

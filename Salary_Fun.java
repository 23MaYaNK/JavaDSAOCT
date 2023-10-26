import java.util.Scanner;

public class Salary_Fun {
    static String askname()
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Employe");
        String x=sc.nextLine();
        sc.close();
        return x;
    }
    static  void  gross_salary(double y)
    {  
       String name2=askname();
        double da=y*10/100;
        double ta=y*20/100;
        double hra=y*30/100;
        double pf=1400.0;
        double gross=y+da+hra+ta-pf;
        System.out.println("The Net salary of the employee Name:=>> "+name2 +"  After All Tax Reduction is:=>"+gross);
        
    }
    static void tax(double x)
    {
        if(x<=10000)
        {
            gross_salary(x);
        }
       else if(x<=10001 && x<=20000)
        { 
            double taxsal= (x*10)/100;
            x-=taxsal;
            gross_salary(x);
        }
        else if(x<=20001 && x<=30000)
        { double taxsal= (x*20)/100;
            x-=taxsal;
            gross_salary(x);
        }
       else if(x>=30001)
        {
            double taxsal= (x*30)/100;
            x-=taxsal;
            gross_salary(x);
        }  
         else 
        {
            gross_salary(x);
        }     

    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic salary of the employe:");
       double basic_salary=sc.nextDouble();
       
       tax(basic_salary);
       
       sc.close();
    }
    
}

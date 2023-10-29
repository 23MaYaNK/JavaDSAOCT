import java.util.Scanner;

public class Drived_menu {
    void opertor(int x ,float  y,float  z)
    { 
        if(x==1)
        {
            Addition(y,z);
        }
        else if(x==2)
        {
            Subtraction(y,z);
        }
        else if(x==3)
        {
            Multiplication(y,z);
        }
        else if(x==3)
        {
            Division(y,z);
        }
        else 
        {
           System.out.println("Invalid choice while choosing the opertations:");
        }

    }
    static void Addition(float x, float y)
    { 
        double result=x+y;
        System.out.println("The Result is :"+result);
        
    }
    static void Multiplication(double x, double y)
    {
        double result=x*y;
        System.out.println("The Result is :"+result);
        
    }
    static void Subtraction(double x, double y)
    {
        double result=x-y;
        System.out.println("The Result is :"+result);
        
    }
    static void Division(double x, double y)
    {
        double result=x/y;
        System.out.println("The Result is :"+result);
    }
    public static void main(String[] args) {
        Drived_menu a= new Drived_menu();        

        Scanner sc=new Scanner(System.in);
        System.out.println("Choose You Choice");
        System.out.println("Press 1 for Addition\r\n" + //
                "\tPress 2 for Subtraction\r\n" + //
                "\tPress 3 for Multiplication\r\n" + //
                "\tPress 4 for Division");
        int ch=sc.nextInt();
        System.out.println("enter the number 1:");
        float num1=sc.nextFloat();
        System.out.println("enter the number 2:");
        float num2=sc.nextFloat();
        a.opertor(ch,num1 ,num2);

        

        sc.close();
    }
}

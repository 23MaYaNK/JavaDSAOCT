import java.util.Scanner;

public class Celsius_Farhenite {
    static void ctof(float x)
    {  
        float f=x*9/5+32;
        System.out.println("The value of Celsius-Temperature "+ x +" in Farhenite is "+f);
        
    }
    static void ftoc(float x)
    {
        float c=x*5/9-32;
        System.out.println("The value of Farhenite-Temperature  "+ x +" in Celsius is "+c);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for conversion the temperature:");
        float temp=sc.nextFloat();
        System.out.println("Choose your Convesion method:");
        System.out.println("1:From Celcius to Farhenite");
        System.out.println("2:From Farhenite to Celcius");
        int ch=sc.nextInt();
        if(ch==1)
        {
            ctof(temp);
        }
        else if(ch==2)
        {
            ftoc(temp);
        }
        else System.out.println("Invalid choice....");
        sc.close();
    }
}

import java.util.Scanner;

public class Area_Reactangle {
    static void area(float x,float y)
    {
        float farea=x*y;
        System.out.println("The area of the Reactangle is:->>"+farea);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Length");
       float len=sc.nextFloat();
       System.out.println("Enter the breadth:");
       float b=sc.nextFloat();
       area(len,b);
    sc.close();
    }
    
}

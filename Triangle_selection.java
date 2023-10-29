import java.util.Scanner;

public class Triangle_selection
{
    static void check(float x,float y,float z)
    {
        if(x==y && x==z && y==z)
        {
            System.out.println("The Triangle is 'Equilateral Triangle'");
        }
        else if( x!=y && y!=z && x!=z)
        {
            System.out.println("The Triangle is 'Scalene Triangle'");
        }
        else if(x==y || y==z  || x==z )
        {
            System.out.println("The Triangle is 'Isoceles Triangle'");
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the all three sides of Triangle");
    float side1=sc.nextFloat();
    float side2=sc.nextFloat();
    float side3=sc.nextFloat();
    check(side1,side2,side3);
    sc.close();

    
}
}
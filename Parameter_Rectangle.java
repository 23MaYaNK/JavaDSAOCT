import java.util.Scanner;

public class Parameter_Rectangle {
    static void para(float x,float y)
    {
        float parameter=2*(x+y);
        System.out.println("The parameter of the Rectangle:=>>"+parameter);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the Length:");
        float len=sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle:->>");
        float b=sc.nextFloat();
        para(len,b);
        sc.close();
    }
    
}

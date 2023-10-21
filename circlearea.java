import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        float rad=scan.nextFloat();
        double area=(rad*rad)*3.14;
        System.out.println("the area of the circle is:"+area);
scan.close();
    }
    
}

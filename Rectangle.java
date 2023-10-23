import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner len=new Scanner(System.in);
        System.out.println();
    int l=len.nextInt();
    int b=len.nextInt();
    int area=l*b;
    System.out.println("The are is calculated:"+area+" cm^2");
    len.close();
    }
    
}

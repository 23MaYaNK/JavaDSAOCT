import java.util.Scanner;

public class gretestamong3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the three number");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println((a>b&&a>c?a+"is greater":b>a&&b>c?b+"is greate":"is greater"+c));
        scan.close();
    }
    
}

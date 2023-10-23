import java.util.Scanner;
public class swapvar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the two value to perform swapping");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("the swap number is: a="+a+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the swap number is: a="+a+"b="+b);
        scan.close();



        
    }
    
}

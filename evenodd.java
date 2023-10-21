import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int a=scan.nextInt();
        System.out.println((a%2==0?"yes, it is even ":"no,is it not even "));
        scan.close();
      }
    
}

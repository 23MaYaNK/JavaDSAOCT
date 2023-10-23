import java.util.Scanner;

public class Odd_Even_Range {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Range");
        System.out.println("Starts From?==>");
        int strt=scan.nextInt();
        System.out.println("Enter the End range?:");
        int end=scan.nextInt();
        System.out.println("Even no. are:");
        for(int i=strt;i<=end;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("Odds no. are:");
        for(int i=strt;i<=end;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
scan.close();
    }
    
    
}

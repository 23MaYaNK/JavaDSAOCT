import java.util.Scanner;

public class Odd_Even {
    static void Even_Odd()
    { System.out.println("Even Numbers are:");
    for(int i=1;i<=100;i++)
    {
        if(i%2==0)
        {
            System.out.print(i+",");
        }
    }
    System.out.println();
    System.out.println("Odd Numbers are:");
    for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Even_Odd();
        sc.close();
    }
    
}

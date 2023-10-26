import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        for(int line=1;line<=n;line++)
        {
            for(int gap=1;gap<=line-1;gap++)
            {
                System.out.print(" ");

            }
            for(int star=1;star<=n;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    

        sc.close();


    }
    
}


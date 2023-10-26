import java.util.Scanner;

public class Invert_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        for(int line=0;line<=n;line++)
        {
            for(int star=0;star<=n-line;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
    
}

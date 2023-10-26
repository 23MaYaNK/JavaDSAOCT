import java.util.Scanner;

public class Hollow_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        for (int line=1;line<=n;line++)
        {
            for(int star=1;star<=line;star++)
            {
                if(star==1|| star==line || line==n|| line==1)
                {
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();

    }
    
}

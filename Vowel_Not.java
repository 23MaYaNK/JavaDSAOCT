import java.util.Scanner;

public class Vowel_Not {
    static void vowel(char x)
    {
        if(x=='E' || x=='e' ||x=='a' || x=='A' || x=='i' ||x=='I' || x=='u' || x=='U' || x=='o' || x=='O')
        {
            System.out.println("The Character is Vowel:");
        }
        else
         {
         System.out.println("The Character is NOT is Vowel");   
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char a=sc.next().charAt(0);
        vowel(a);
        sc.close();
    }
    
}

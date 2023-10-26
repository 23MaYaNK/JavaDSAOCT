import java.util.Scanner;

public class Upper_lower {
    static void Lowertoupper(String x)
    {  
    String str1=x.toLowerCase();  
    System.out.println("New format of string is: "+str1);
     
    }
    static void Uppertolower(String  x)
    {
       String str1=x.toLowerCase();
        System.out.println("New format of string is: "+str1);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Choose your Convesion method:");
        System.out.println("1:From Lower to Upper");
        System.out.println("2:From Upper to Lower:");
        int ch=sc.nextInt();
        if(ch==1)
        {
            Lowertoupper(str);
        }
        else if(ch==2)
        {
            Uppertolower(str);
        }
        else System.out.println("Invalid choice....");
        sc.close();
    }
}

import java.util.Scanner;

public class Grade_check {
    static void check(int a)
    {
    if(a>90)
    {
        System.out.println("Garde is: 'A'");
    }
    else if(a>=89 && a>=70)
    {
        System.out.println("Garde is: 'B'");
    }
    else if(a>=69 && a>=50)
    {
        System.out.println("Garde is: 'C'");
    }
    else if(a<50)
    {
        System.out.println("Garde is: 'D'");
    }
    else
    {
        System.out.println("The percentage is out of range or invalid...");
    }
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Percentage");
        int a=sc.nextInt();
        check(a);
        
        sc.close();
    }
    
}


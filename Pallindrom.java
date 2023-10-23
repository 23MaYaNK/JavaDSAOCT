import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int m=n;
        int num=0;
        
        while(m>0)
        {
            int k=m%10;
            m=m/10;
            num*=10;
            num=num+k;
        }
        
        if(num==n)
        {
            System.out.println("Number "+n +" is 'Pallindrom'");
        }
        else
        {
            System.out.println("Number "+n +" is Not 'Pallindrom'");
        }
        sc.close();
    }
    
}

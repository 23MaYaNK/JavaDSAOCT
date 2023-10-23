import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int m=sc.nextInt();
        
        int num=0;
        
        while(m>0)
        {
            int k=m%10;
            m=m/10;
            num*=10;
            num=num+k;
        }
        System.out.println("Reverse number:"+num);
        
        
        sc.close();
    }
    
}


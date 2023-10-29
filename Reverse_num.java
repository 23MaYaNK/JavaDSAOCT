import java.util.Scanner;

public class Reverse_num {
    void reverse(int x)
    {
       int  sum=0;
      int  copy=x;
       while (x>0) 
       {
        int w=x%10;
        sum=sum*10;
        sum+=w;
        x/=10;
    }
    System.out.println("The sum of digits of number "+copy+" is: "+ sum); 
    }
    public static void main(String[] args) {
        Reverse_num m=new Reverse_num();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse");
        int s=sc.nextInt();
        m.reverse(s);
        sc.close();
    }
    
}

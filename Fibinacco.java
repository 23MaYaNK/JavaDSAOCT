import java.util.Scanner;

public class Fibinacco {
    static void series(int x)
    {   int a=0;
        int b=1;
        if(x==1)
        {
            System.out.println(a+",");
        }
        else if (x==2)
        {
            System.out.println(a+","+b);
        }
        else
        {
        System.out.print(a+","+b+",");
          for(int i=x-2;i>0;i--)
            {
                int c=a+b;
                a=b;
                b=c;           
                 System.out.print(c+",");
            }

            }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term for series you want to print:");
        int term=sc.nextInt();
        series(term);
        sc.close();
    }
    
}

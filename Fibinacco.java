import java.util.Scanner;

public class Fibinacco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for term:");
        int term=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+",");
        while(term>1)
        {
           
            int temp;
            System.out.print(b+",");
            
            temp=a;
            a=b;
            b=a+temp;
            term--;
            }
            System.out.print("last term:"+b);
            sc.close();
        }

        
            
        
           

        }
        
     

        
    
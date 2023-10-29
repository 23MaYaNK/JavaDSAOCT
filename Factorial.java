import java.util.Scanner;

public class Factorial {
    static int  Fact(int num)
    { 
        
        int fact=num;
        if(num==1 || num==0)
        {
            return 1;
        }
        else 
        {  for(int i=num-1;i>0;i--)
            { 
                fact=fact*i;
               
            }
        }  
        

        
        System.out.println(fact);
        return fact;
    }

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number that you want it's Factorial:");
    int num=sc.nextInt();
    int fact2= Fact(num);
    System.out.println("Factorial is :"+fact2);
        sc.close();
    }
    
}

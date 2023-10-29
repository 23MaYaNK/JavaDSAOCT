import java.util.Scanner;
public class Square_root {
      
    static void Square_rootfun(float num)
    { 
        float copy=num;
        double  result=Math.sqrt(num);
        
        System.out.println("The Square Root of the Number "+copy+" is: "+result);
    } public static void main(String[] args) {Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to it's Square root:");
        float num=sc.nextFloat();
        Square_rootfun(num);
        sc.close();
    }
    
}

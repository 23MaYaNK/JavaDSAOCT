import java.util.Scanner;

public class Swap_without_3v {
    static void swap_add(int x,int y)
    {
        System.out.println("The 1st number is: "+x+" and the 2nd number is:"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("The 1st number is: "+ x +" and the 2nd number is:"+y);

    }
    static void swap_comp(int x,int y)
    {
        System.out.println("The 1st number is: "+x+" and the 2nd number is:"+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("The 1st number is: "+ x +" and the 2nd number is:"+y);

    }
    static void swap_div(int x,int y)
    {
        System.out.println("The 1st number is: "+x+" and the 2nd number is:"+y);
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("The 1st number is: "+ x +" and the 2nd number is:"+y);

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number:=>");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number:=>");
        int num2=sc.nextInt();
        swap_add(num1,num2);
        swap_div(num1,num2);
        swap_comp(num1,num2);

        sc.close();
    }
    
}

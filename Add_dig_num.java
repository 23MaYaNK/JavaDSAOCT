import java.util.Scanner;

public class Add_dig_num {
    void sum(int x)
    { int sum=0;
        int copy=x;
        while(x>0)
        { int num=x%10;
            sum+=num;
            x/=10;
        }
        System.out.println("The sum of digits of number "+copy+" is: "+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Add_dig_num d=new Add_dig_num();
        System.out.println("enter the number 1:");
        int ch=sc.nextInt();
        d.sum(ch);
        sc.close();
    }
    
}

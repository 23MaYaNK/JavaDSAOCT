import java.util.Scanner;

public class Sum_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("USER: Enter the number");
        int num=scan.nextInt();
        
        int m;
        int sum=0;
        while(num>0)
        {
            m=num%10;
            sum=sum+m;
            num=num/10;
            

        }
        System.out.println("The Number your entered  is of Digit: "+ sum);
        scan.close();
        


    }
    
}


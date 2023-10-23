import java.util.Scanner;

public class Net_salary {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);  
    System.out.println("ENTER THE BASIC SALARY AMOUNT");
    
    float bs=Scan.nextFloat();
    System.out.println("ENTER THE AMOUNT OF THE PF:");
    float pf=Scan.nextFloat();
    float hra=bs*30/100;
    float ta=bs*20/100;
    float da=bs*10/100;
    float nets=bs+hra+da+ta-pf;
    System.out.println("Your Net salary is:"+nets);
    Scan.close();

    }
    
}

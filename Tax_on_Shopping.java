import java.util.Scanner;
public class Tax_on_Shopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your total amount of the Shopping:");
        double amt =scan.nextDouble();
        if(amt < 1000)
        {
            System.out.println("There is No discount for you sorry:");
        }
        else if(1000<= amt && amt<= 5000)
        { double dis=amt*(5/100.0);
            amt-=dis;
            System.out.println("Your total amount that you have to pay after 5% discount is:"+amt);
        }
        else if(5001<=amt && amt<=10000)
        {
            double dis=amt*(10/100.0);
            amt-=dis;
            System.out.println("Your total amount that you have to pay after 10% discount is:"+amt);
        }
        else if(10000<=amt && amt<=20000)
        {
            double dis=amt*(15/100.0);
            amt-=dis;
            System.out.println("Your total amount that you have to pay after 15% discount is:"+amt);
        }
        else if(20000<=amt)
        {
            double dis=amt*(25/100.0);
            amt-=dis;
            System.out.println("Your total amount that you have to pay after 25% discount is:"+amt);
        }
        else
        {
            System.out.println("May you enter 'INVALID Amount' , kindly recheck it.. ThankYOU");
        }

scan.close();
        
    }
    
}

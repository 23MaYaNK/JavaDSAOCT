import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the number from '1' to '7'");
        int num1=num.nextInt();
        if(num1==1)
        {
            System.out.println("The day is 'Sunday'");
        }
         if(num1==2)
        {
            System.out.println("The day is 'Monday'");
        }
         if(num1==3)
        {
            System.out.println("The day is 'tuesday'");
        }
         if(num1==4)
        {
            System.out.println("The day is 'Wednesday'");
        }
         if(num1==5)
        {
            System.out.println("The day is 'Thursday'");
        }
         if(num1==6)
        {
            System.out.println("The day is 'Friday'");
        }
         if(num1==7)
        {
            System.out.println("The day is 'Saturday'");
        }
        else{
            System.out.println("You didn't enter the input according to range");
        }
        num.close();
    }
    
}

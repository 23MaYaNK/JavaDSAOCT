import java.util.Scanner;

public class Week_Days_Ends {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your data:");
    String day=scan.nextLine();
    String day2=day.toUpperCase();
    switch(day2)
    {
        case "SUNDAY":
        {
            System.out.println("this is an Weekend..");
            break;

        }
        case "SATURDAY":
        {
            System.out.println("this is an Weekend..");
            break;

        }
        default:System.out.println("This an Weekdays..");
        
    }
    scan.close();


        
    }
    
}

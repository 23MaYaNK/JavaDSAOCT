import java.util.Scanner;

public class Weather_Determinator {
     public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month:");
        String month=scan.nextLine();
        String month2=month.toLowerCase();
        switch(month2)
        {
           case "january" :
           {
            System.out.println("Winter Season");
            break;
           }
           case "feburary":
           {
            System.out.println("Winter Season");
            break;
           }
           case "march":
           {
            System.out.println(" Summer Season");
            break;
           }
           case "april":
           {
            System.out.println("Summer  Season");
            break;
           }
           case "may":
           {
            System.out.println("Summer Season");
            break;
           }
           case "june":
           {
            System.out.println("Rainy/Monsoon Season");
            break;
           }
           case "july":
           {
            System.out.println("Rainy/Monsoon Season");
            break;
           }
           case "august":
           {
            System.out.println("Rainy/Monsoon Season");
            break;
           }
           case "september":
           {
            System.out.println("Windy/Autumn Season");
            break;
           }
           case "october":
           {
            System.out.println("Windy/Autumn Season");
            break;
           }
           case "november":
           {
            System.out.println("Windy/Autumn Season");
            break;
           }
           case "december":
           {
            System.out.println("Winter Season");
            break;
           }
           default:System.out.println("You Enter 'Invalid Month'");
        }
        scan.close();
    
}
    
}

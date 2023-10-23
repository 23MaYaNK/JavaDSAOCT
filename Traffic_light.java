import java.util.Scanner;

public class Traffic_light {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the color of Traffic light:");
        String light=scan.nextLine();
        String light2=light.toLowerCase();
        switch(light2)
        {
            case "red":
            {
                System.out.println("STOP..!! "); 
                break;
            }
            case "yellow":
            {
                System.out.println(" Start Your Vehicle Ready To Move..!!");
                break;
            }
            case "green":
            {
                System.out.println("Go..Ahead..!!");
                break;
            }
            default:
            System.out.println("You Enter invalid/wrong Light Color");
        }
        scan.close();
    
}
    
}

import java.util.Scanner;

public class BMI_cal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Height in Cm:");
        float ht=scan.nextFloat();
        System.out.println("Enter your weight in kg:");
        float wt=scan.nextFloat();
        float bmi=wt/(ht*ht);
        System.out.println("Your BMI accoding to the give Data:"+bmi);
        scan.close();
    }
    
}

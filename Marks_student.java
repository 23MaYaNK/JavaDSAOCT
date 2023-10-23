import java.util.Scanner;

public class Marks_student {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name=scan.next();
        System.out.println("Enter the class of the student:");
        int classs=scan.nextInt();
        System.out.println("Enter the marks of Physics:");
        float phy=scan.nextFloat();
         System.out.println("Enter the marks of Bio:");
        float bio=scan.nextFloat();
         System.out.println("Enter the marks of Chemistry:");
        float  chem=scan.nextFloat();
         System.out.println("Enter the marks of Maths:");
         float  mat=scan.nextFloat();
         System.out.println("Enter the marks of English:");
        float eng=scan.nextFloat();
        float per=(mat+phy+chem+eng+bio)*100/500;
        float avg=(mat+phy+chem+eng+bio)/5;

        System.out.println("The Percentage of " + name +"of the class "+ classs + " by given data is" +per+"%");
        System.out.println("The average marks of the student is:"+avg);

    scan.close();}
    
}

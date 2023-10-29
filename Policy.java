import java.util.Scanner;

public class Policy {
    static void check(char c,char g,int a)
{ 
    if((a>=25 && a<=35 )&&( g=='M' || g=='m') && (c=='Y' || c=='y'))
    {
        System.out.println("6% Premium");
    }
    else if((a>=25 && a<=40 )&&( g=='M' || g=='m') && (c=='N' || c=='n'))
    {
        System.out.println("4% Premium");
    }
    else if((a>=25 && a<=42 )&&( g=='F' || g=='f') && (c=='Y' || c=='y'))
    {
        System.out.println("3% Premium");
    }
    else if((a>=25 && a<=45 )&&( g=='F' || g=='f') && (c=='N' || c=='n'))
    {
        System.out.println("2% Premium");
    }
    else 
    {
        System.out.println("No Insurance:");
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Person");
        String name=sc.nextLine();
        System.out.println("Enter the age of the Person");
        int age=sc.nextInt();
        //sc.nextLine(); 
        System.out.println("Enter the Gender of the Person");
        System.out.println("In format of 'M' and 'F' ");
        char gen=sc.next().charAt(0);
        System.out.println("Enter the city of the person is an metro city or not");
        System.out.println("In format of 'Y' and 'N' ");
        char city=sc.next().charAt(0);
        System.out.println(name+" is name "+gen+" is gender "+city+" is the city"+age+"   is the age");
        check(city,gen,age);
        
        sc.close();

    }
    
}

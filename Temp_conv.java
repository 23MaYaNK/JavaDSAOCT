import java.util.Scanner;

public class Temp_conv {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hey user this is an program for temperature convertor:");
        System.out.println("Select your choice accordingly");
        System.out.println("'1': for 'celsius To Farhenite'      '2':For 'Farhenite To Celsius' ");
        int ch=scan.nextInt();
        if(ch==1)
        {
        System.out.println("You choose '1' To change celcius into Farhenite");
        System.out.println("Enter the value for celius temperature");

        float cel=scan.nextFloat();
        float far=cel*9/5+32;
        System.out.println("The temperature value in celcius by given you is :  "+cel  +" value  in farhenite is:  "+  far );

        }
        else if(ch==2)
        {
        System.out.println("You choose '2' To change Farhenite into celcius");
        System.out.println("Enter the value for Farhenite temperature");

        float far=scan.nextFloat();
        float cel=(far*5/9)-32;
        System.out.println("The temperature vlaue in Farhenite by given celius"+ far +" value in celcius is:"+cel);

        }
        else{
            System.out.println("May you enter the invalid input");
        }
        
    scan.close();}
    
}
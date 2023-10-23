import java.util.Scanner;

public class VovelConsonent {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter you character:");
        char input=scan.next().charAt(0);
        char vowel[]={'a','A','e','E','i','I','o','O','u','U'};
int no=0;
        for(int i=0;i<vowel.length;i++)
        {
      if(input==vowel[i])
        {
        no++;
        }
        }
    if(no!=0)
        {
          System.out.println("The  " + input +" is an vowel ");    
        }
        else
        {
            System.out.println(input + ",this is not an vowel !! This is consonent");
        }
        
        
        scan.close();
    }
    
}

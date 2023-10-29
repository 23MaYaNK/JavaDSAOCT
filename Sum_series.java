import java.util.Scanner;
public class Sum_series { 
        static void series(int range)
        {
            int sum=0;
         
            for(int i=1;i<=range;i++)
            { 
                    sum=sum+i;
                
            }
            System.out.println("The sum is: "+sum);
        }
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the range you want sum:");
            int range=sc.nextInt();
            series( range);
            sc.close();
    
            
        }
        
        
    }
    
    


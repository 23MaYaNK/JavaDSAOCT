public class second {
    public static void main(String[] args) {
       // String name=args[0];
        int sum=0;
        for (int i=0;i<args.length;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("this is the sum of CMD ling args:"+sum);
       
        }
       
    }
    


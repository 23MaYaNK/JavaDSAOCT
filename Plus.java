public class Plus {
    public static void main(String[] args) {
        for (int line=1;line<=9;line++)
        {
            for(int star=1;star<=9;star++)
            {
                if( star==5  || line==5 )
                {
                    System.out.print("+  ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
}

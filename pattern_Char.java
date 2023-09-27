package Control_Flow;

public class pattern_Char {

	public static void main(String[] args) {
		int n=6;
		int alphabet=65;
		for(int i=0;i<= n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int c=1;c<=i*2-1; c++)
            {
                System.out.print(" ");
            }
            for(int c=n-i; c>=0; c--)
            {
                if(c!=n) 
                    System.out.print((char)(alphabet+c));
            }
           System.out.println();
        }
		

	}

}

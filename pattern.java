package Control_Flow;

public class pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
				 }
			System.out.println(" ");
		  }
		
		
		int m=5;
		for(int r=1;r<=m;r++) {
			 
			for(int c=1;c<=m-r+1;c++) {
				System.out.print("1"+c+" ");
			}
			
  			System.out.println(" ");
     	}

		int num=5;
		int ch=64;
		for(int r=1;r<=num;r++){
			
			for(int c=num-r;c>=0;c--) {
				System.out.print(" ");
			}
			for(int c=1; c<=r;c++) {
				
				System.out.print((char)(ch+c));
			     
			
			}
			
			System.out.println(" ");
			
		}
		
		
	}

}

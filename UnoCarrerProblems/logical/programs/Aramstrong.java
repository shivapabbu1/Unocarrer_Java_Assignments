package logical.programs;

public class Aramstrong {

	public static void main(String[] args) {
	int n=153,r,sum=0;
	int m=n;
	
//while(n>0) or for(;n>0;)
	
  for( int i=n;i>0;i--){
	r=n%10;
	sum+=(r*r*r);
	n=n/10;
	}
 if(sum==m) {
	System.out.println( m+"true.it is aramstromg");
 }else {
	System.out.println(m+"false.it is not aramstrong");
 }
			

	}

}

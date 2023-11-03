package logical.programs;

public class ncr {

	public static int Fact1(int n) {
		int fact=1;
		for(int i=n;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
	public static int Fact2(int n,int r) {
		int fact=1;
		for(int i=n-r;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
	
       int N= Fact1(5);
       System.out.println("Factorial of NUMBER 5"+N);
       int r=Fact1(2);
       System.out.println("Factorial of NUMBER 2"+r);
       int res=Fact2(5,2);
       
        int output=(N/(r*res));
        System.out.println("R factors from ncr forumla:"+output);
	}

}

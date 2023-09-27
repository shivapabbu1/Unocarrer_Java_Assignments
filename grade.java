package Control_Flow;

public class grade {

	public static void main(String[] args) {
		// Use terinary operator only ,input as command lines 
		int x=Integer.parseInt(args[0]);
		 char res=x<60 ?'F':x<74 && x>61 ?'C':x<75 && x>89 ?'B':'A';
		 System.out.println(res);
	}

}

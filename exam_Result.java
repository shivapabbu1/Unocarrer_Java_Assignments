package Control_Flow;

import java.util.Scanner;

public class exam_Result {

	public static void main(String[] args) {
		// test case:
	//	1.A should get 55 or more and B get 45 or more
	// 2. he get less than 55 in A,should get 55 or more in b .i.e atleast 45 in A
	 // 3. he get less than 54 in B,shoUld get 65 or more in b .i.e allowed to reapper in B.
		 
	
		Scanner result=new Scanner(System.in);
		System.out.println("Enter your percentage in A:");
		int A=result.nextInt();
		System.out.println("Enter your percentage in B:");
		int B=result.nextInt();
		result.close();
		
		if((A>=55 && B>=45)|| (A<55 && B>=55 && A>45)){
			System.out.println(" The student is PASSED....");
		}else if(B<55 && A>=65) {
			System.out.println(" The student is allowed to reapper in Exam B.");
		}else {
		System.out.println("The student is FAILED.....");
	    }
	}

}

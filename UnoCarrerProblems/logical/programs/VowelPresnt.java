package logical.programs;
import java.util.*;
public class VowelPresnt {
	
	 static void  isVowel(String s) {
		 boolean isPresent=false;
		 s=s.toLowerCase();
		 char ch;
		 char[]ar= new char[s.length()];
		 int index=0;
		 for(int i=0;i<s.length();i++) {
			 ch=s.charAt(i);
	if(ch==97 || ch==101 ||ch==105 ||ch==111 ||ch==117) {
				isPresent=true;
				ar[index]=ch;
				index++;
			    }//if
	           else {
				isPresent=false;
			   }
		  }//for i
		 
		if(isPresent) {
			System.out.println(" No vowel is present");
		     }   else {
				System.out.println("vowel is presnt");
				  for(int i=0;i<index;i++) {
					 System.out.println(ar[i]+" ");
				  }
			  }
	} //function
	
	//another method:
	 
	 
	 static void isVowels(String str1,String str2) {
		
		int index=0;
		int count=0;
		char ch[]=new char[str1.length()];
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					ch[index]=str1.charAt(i);
					index++;
					count++;	
				}//if
			}//for j
		}//for i
		
		 if(count==0) {
			System.out.println("novowel is present");
		} else {
			System.out.println(count+"  vowes  present");
			for(int k=0;k<index;k++) {
				System.out.print(ch[k]+" ");
			}	
		}
	}//function

	public static void main(String[] args) {
    isVowels("shiva","aeiou");
    System.out.println(" \n**************");
		isVowel("kiran");
		
		

		
		
	}

}

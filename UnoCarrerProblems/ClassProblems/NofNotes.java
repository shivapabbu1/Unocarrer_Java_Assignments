package classProblems;

public class NofNotes {

	public static void main(String[] args) {
		double amount=15552;
		int notes[]= {500,200,100,50,20,10,5,2,1};
		for(int i=0;i<notes.length;i++) {
			int res=(int)amount/notes[i];
			 amount=amount%notes[i];
			 
			 if(res>0) {
			 System.out.println(notes[i]+" notes are:"+ res);
			 }
		  }


	}

}

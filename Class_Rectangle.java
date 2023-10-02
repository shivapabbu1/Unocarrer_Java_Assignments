package classAndObject;
import java.math.*;

 class rectangle{
	
    int length;
	 int bredth;
	 
	

        
  public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBredth() {
		return bredth;
	}


	public void setBredth(int bredth) {
		this.bredth = bredth;
	}


    public  void Area() {
	int area=length*bredth;
	System.out.println(area);
	}
    
   public  void perimeter() {
	int perimeter=2*(length+bredth);
	System.out.println(perimeter);
    }
    public  void diagonal() {
	double diagonal=Math.sqrt((length*length)+(bredth*bredth));
	System.out.println(diagonal);
	
     }

 }

  public class Class_Rectangle {
    	public static void main(String[] args) {
      
     rectangle obj=new rectangle();
     obj.length=4;
     obj.bredth=3;
      obj.Area();
      obj.setLength(5);
      obj.perimeter();
      obj.setBredth(4);
      obj.diagonal();
       
       
      
   
      
     

	}

}

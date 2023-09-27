package Control_Flow;
import java.util.*;
public class health_Check {
	 static float targetWeight;
	 static float heightInMeters;
	 static float BMI;
	 static float weight;
	 static float height;
	 static String gender;
	  static String status=null;
	  static float fixedHeight=60;
	  static float fixedWeight=50;
	  static float extraHeight;
	  
	  
	  public static void Status( float BMI)
	  {
			 if(BMI< 18.5) 
			 {
			   status="Under Weight";
			 } else if(BMI>=18.5 && BMI <24.9) {
				 status="Normal";
			 } else if(BMI>=25.0 && BMI <29.9) {
				 status="Over Weight"; 
			 } else if(BMI>=30.9) {
				 status="Obesse"; 
			 } 
		 }
	  
	   public static void TargetWeight(float height) 
	   {
		  if(gender =="male")
		  {
			  if(height<=fixedHeight) {
				  targetWeight=fixedWeight;
			  } 
			     else if(height>fixedHeight) 
			     {
				  extraHeight=(height-fixedHeight)*(2.3f);
				 
				  targetWeight=fixedWeight+extraHeight;
				  }
		  } else 
		   {
			    if(height<=fixedHeight) {
				  targetWeight=45.5f;
			     } else if(height>fixedHeight) {
				  extraHeight=(height-fixedHeight)*(2.3f);
				  
				  targetWeight=fixedWeight+extraHeight;  
			     }
		    }
	  }
	public static void main(String[] args) {
		
	Scanner health=new Scanner(System.in);
	System.out.println("Enter your Gender:");
	 gender=health.nextLine();
	System.out.println("Enter your weight in KGs:");
	 weight=health.nextFloat();
	System.out.println("Enter your height in Inches:");
	height=health.nextFloat();
	 health.close();
	
	  //conversion of height in to meters
	  heightInMeters=  (float)(height*(0.0254));
	  //calculate BMI
	  BMI= (weight/(heightInMeters*heightInMeters));
      //Status method used to define status:
	  Status(BMI);
	 //Target weight method is used to find target weight
	 TargetWeight(height);
	
	 System.out.println("current weight:"+ weight+"Kgs");
     System.out.println("BMI :"+ BMI);
     System.out.println("Staus:"+ status);
     System.out.println("Gender:"+ gender);
     System.out.println("targetWeight:"+ targetWeight+"Kgs");
     
     if(targetWeight<weight) {
    	 System.out.println("you should gain"+ (weight-targetWeight)+" Kgs. to get fit....!");
     }else {
    	 System.out.println("you should loose"+ (targetWeight-weight)+" Kgs. to get fit....!");
     }
       
	}

}

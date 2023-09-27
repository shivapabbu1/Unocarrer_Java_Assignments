package coreJava;
import java.util.*;
public class Calender_Days {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = input.nextInt();
        
     int years = totalDays/365;
     int remaining = totalDays%365;
     int months = remaining/30;
     int reamingdays = months%30;
     
     System.out.println(years+"year");
     System.out.println(months+"months");
     System.out.println(reamingdays+"days");

     
	}

	}



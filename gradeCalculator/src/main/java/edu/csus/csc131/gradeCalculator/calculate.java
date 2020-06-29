package edu.csus.csc131.gradeCalculator;
import java.text.DecimalFormat;

//model

public class calculate  {
	
	
	private static DecimalFormat df = new DecimalFormat("#.##");
	private static double grade;
	
	public static double calculateGrade(double nt1, double dt1, double nt2, double dt2, double nt3, double dt3, double nt4, double dt4, double nt5, double dt5) {
		

		 grade = ((nt1 / dt1)*(0.01) + (nt2 /dt2 )*(.25) + (nt3/ dt3)*(.30) + (nt4 / dt4)*(.19) + (nt5 / dt5)*(.25))  * 100; 
		 
		 return Double.parseDouble(df.format(grade));
		 
	 
	}

}







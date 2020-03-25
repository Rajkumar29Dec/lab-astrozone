package service;
import java.time.*;
import java.util.*;
// Type your code

public class AstroCalculator
{
	public String findSign(model.User u)
	{
		int d=u.dob;
		LocalDate birthday = new LocalDate(d);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(pdate, now);
		int DOB[]=d.split("/");
	   int date=DOB[0];
	   int month=DOB[1];
	   System.out.println("Your details");
	   System.out.println("Name: "+u.name);
	   System.out.println("Age: "+diff.getYears());
		if ((date>21 && month == 12) || (date<=19 && month== 1)){
	           System.out.println( "Capricon");
	       }
	       if ((date>20 && month ==1) || (date<=18 && month == 2)){
	    	   System.out.println( "Aquarius");
	       }
	       if ((date>19 && month == 2) || (date <=20 && month == 3)){
	    	   System.out.println("Pisces");
	       }
	       if ((date>21 && month == 3) || (date <=20 && month == 4)){
	    	   System.out.println( "aries");
	       }
	       if ((date>21 && month == 4) || (date <=20 && month == 5)){
	    	   System.out.println("Taurus");
	       }
	       if ((date>21 && month == 5) || (date<=20 && month == 6)){
	    	   System.out.println("Gemini");
	       }
	       if ((date>21 && month == 6) || (date<=20 && month == 7)){
	    	   System.out.println( "Cancer");
	       }
	       if ((date>21 && month  == 7) || (date<=20 && month== 8)){
	    	   System.out.println( "Leo");
	       }
	       if ((date>21 && month ==8) || (date<=22 && month == 9)){
	    	   System.out.println( "Virgo");
	       }
	       if ((date>23 && month == 9) || (date<=20 && month ==10)){
	    	   System.out.println( "Libra");
	       }
	       if ((date>21 && month == 10) || (date<=22 && month == 11)){
	    	   System.out.println("Scorpio");
	       }
	       if ((date>23 && month == 11) || (date<=20 && month == 12)){
	    	   System.out.println( "Sagitarius");
	       }
	       else
	    	   System.out.println( "Should enter all the values");	
	}
	
}
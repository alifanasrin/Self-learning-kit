package rentalcar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class timetrack {
	
	DataStorage x = new DataStorage();
	 Map<String, ArrayList<String>> multiValueMap = x.gettmap();
	 billing b=new billing();
	public void tracktime(String s,String s1) {
		String d1=multiValueMap.get(s1).get(0);
		String d2=multiValueMap.get(s1).get(1);
		 SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		  try {
			  
	           Date p1 = sdf.parse(d1);
	            Date p2 = sdf.parse(d2);
	  
	           
	            long difference_In_Time
	                = p2.getTime() -p1.getTime();
	  
	    long difference_In_Seconds= (difference_In_Time/ 1000) % 60;
	  
	            long difference_In_Minutes = (difference_In_Time / (1000 * 60))% 60;
	  
	            long difference_In_Hours= (difference_In_Time/ (1000 * 60 * 60)) % 24;
	  
	            long difference_In_Years= (difference_In_Time/ (1000l * 60 * 60 * 24 * 365));
	  
	            long difference_In_Days= (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
	            
	 b.bill(difference_In_Days, d2);
	  
	         
	        }
	  
	       
	        catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }

	    
		    		   
	}



package rentalcar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

public class billing  {
	 DataStorage x = new DataStorage();
	 Map<String, ArrayList<String>> multiValueMap = x.gettmap();
	 HashMap<String, String> premiumpeople = x.getPremiumpeopleMap();
	 HashMap<String, String> regularpeople = x.getRegularpeopleMap();
	public void bill(long d,String k) {
		String s1;
	  long bills=d*350;
	  double total=0;
	 
	if (premiumpeople.containsKey(k))
	{if (0<bills && bills<5000)
		total=bills;
	else if(5000<=bills && bills<10000)
		total=bills-bills*0.1;
	else if(10000<=bills)
		total=bills-bills*0.2;
	
	}
	  else 
	  {
		  if (0<bills && bills<4000)
				total=bills;
			else if(4000<=bills && bills<8000)
				total=bills-bills*0.15;
			else if(8000<=bills && bills<12000)
				total=bills-bills*0.20;
			else 
			total=bills-bills*0.25;
	  }
	  System.out.println("How would you like to pay the amount\n1.EUR\2.USD\n3.GBP\n4.AUD\n5.JPY\n6.GBR\n7.INR ");
	  Scanner x = new Scanner( System.in );
 	 int l=x.nextInt();
 	 if(l==1)
 	 { total=total*0.011;
 	 System.out.println("Amount to be payed would be EUR "+total);
 	 }
 	 else if(l==2)
 		{ total=total*0.014;
 	 System.out.println("Amount to be payed would be USD "+total);
 	 }
 	 else if(l==3)
 	 { total=total*0.0097;
 	 System.out.println("Amount to be payed would be GBP "+total);
 	 }
 	 else if(l==4)
 		{total=total*0.018;
 	 System.out.println("Amount to be payed would be AUD "+total);
 		}
 	else if(l==5)
 		{total=total*1.50;
 	 System.out.println("Amount to be payed would be JPY "+total);
 		}
 	 else if(l==6)
 		{total=total*1.50;
 	 System.out.println("Amount to be payed would be JPY "+total);
 		}
 	 else
  		
  	 System.out.println("Amount to be payed would be INR "+total);
 		 

 	
	    
		    		   
	}}



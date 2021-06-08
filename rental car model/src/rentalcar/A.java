package rentalcar;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception {
		 DataStorage p = new DataStorage(); 
		HashMap<String, String> premiumpeople = p.getPremiumpeopleMap();
		 HashMap<String, String> regularpeople = p.getRegularpeopleMap();
		usermanagement user=new usermanagement();
		carinventory car=new carinventory();
		timetrack t=new timetrack();
	boolean bool=true;
		String str="";
		while(bool)
		{
		 
	    	 System.out.print("\nWELCOME TO CAR RENTAL PORTAL\n");
	    	 System.out.println("1.Create an account\n2.Delete your account\n3.Rent a car\n4.Add a new car or return a car\n5.Exit");
	    	 int k;
	    	 Scanner x= new Scanner( System.in );
	    	 k=x.nextInt();
	    	 switch(k)
	    	 {case 1:user.create();
	 		   break;
	    	 case 2:{System.out.println("enter login credentials\n");
	    	 Scanner sc= new Scanner(System.in);
	    	   str = sc.nextLine();
	    	   if (premiumpeople.containsKey(str)||regularpeople.containsKey(str))
	    		 user.delete(str);
	    	   else
	    		   System.out.println("no uch accunt exists");
	    	 }
	    	 break;
	    	 case 3:{ System.out.print("enter your id/phone number\n");
	    	 Scanner sc= new Scanner(System.in);
	    	   str = sc.nextLine();   
	    	   if (premiumpeople.containsKey(str)||regularpeople.containsKey(str))
	          	 car.Carrenting();
	    	   else
	    		   System.out.println("You do not have an account ,please create an account\n");
	    	 }
	    	
	    	 break;
	    	 case 4: System.out.print("enter your id/phone number\n");
	    	 Scanner sc= new Scanner(System.in);
	    	   str = sc.nextLine();   
	    	   {if (premiumpeople.containsKey(str)||regularpeople.containsKey(str))
	          	 car.addcar(str);
	    	   else
	    		   System.out.println("You do not have an account ,please create an account\n");
	    		
	    		   break;
	    	 }
	    	 case 5:
	    		 {System.out.println("THANK YOU FOR VISITING\n");
	    		 bool=false;
	    		 }
	    		 }}
	
	}

}

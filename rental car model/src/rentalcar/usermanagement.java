package rentalcar;
import java.util.HashMap;
import java.util.Scanner;
public class usermanagement {
	 DataStorage x = new DataStorage();
	 HashMap<String, String> premiumpeople = x.getPremiumpeopleMap();
	 HashMap<String, String> regularpeople = x.getRegularpeopleMap();
	 
	 
	 void create() {
		
	 
		System.out.println("Would you like to be our 1)PREMIUM CUSTOMER\n2 REGULAR CUSTOMER\n");
		int s;
		 Scanner p= new Scanner(System.in);
		 s=p.nextInt();
	
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter your phone number/username please:\n");
	String str= sc.nextLine();
	if(s==1)
	{	premiumpeople.put(str,"ACTIVE");
	
	}
	else
	{	regularpeople.put(str, "ACTIVE");
	
	}
	
	 }
	
	
	 void delete(String str) {

		 if (premiumpeople.containsKey(str))
					premiumpeople.replace(str,"INACTIVE");
					else
						regularpeople.replace(str, "INACTIVE");
			 
			 
	
		 System.out.println("Your acount has been succesfully deleted");
		 }
	
	 }

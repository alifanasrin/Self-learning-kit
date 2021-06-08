package rentalcar;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;  
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class carinventory  {
	 DataStorage x = new DataStorage();
	 timetrack t=new timetrack();
	 Map<String, ArrayList<String>> multiValueMap = x.gettmap();
	 billing b =new billing();
	
	 Date date = Calendar.getInstance().getTime();  
     DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
      String strDate = dateFormat.format(date); 
    
       
	protected void Carrenting() {
		         
		System.out.println("Enter the category you would like to rent a car from\n1.SUV\n2.SEDAN\n3.Hatchback");
	int s;
	 Scanner p= new Scanner(System.in);
	 s=p.nextInt();
	 HashMap<String, String> suv = x.getSuvMap();
	 System.out.print("Following are the list of cars cars\n");
	 switch(s)
	 {
	 case 1:
	 { 
		System.out.print(suv);
		System.out.print("Kindly type the car number you would like to choose\n");
		Scanner sc1= new Scanner(System.in);
		String str1= sc1.nextLine();  
		 
          multiValueMap.put(str1, new ArrayList<String>());
      	multiValueMap.get(str1).add(strDate);
      	multiValueMap.get(str1).add("not yet returned");
		suv.remove(str1);
	 }
		break;
	 case 2:
		 {HashMap<String, String> sedan = x.getSedanMap();
			System.out.print("Following are the list of SEDAN cars\n");
			System.out.print(sedan);
			System.out.print("Kindly type the carnumber you would like to choose\n");
			Scanner sc= new Scanner(System.in);
			String str0= sc.nextLine();
			
	      	multiValueMap.get(str0).add(strDate);
	      	multiValueMap.get(str0).add("not yet returned");
			sedan.remove(str0);
		 }
		break;
	 case 3:
		 {HashMap<String, String> hatchback = x.getHatchbackMap();
		 System.out.print("Following are the list of HATCHBACK cars\n");
			System.out.print(hatchback);
			System.out.print("Kindly type the car you would like to choose\n");
			Scanner sc2= new Scanner(System.in);
			String str2= sc2.nextLine();   
		
	          multiValueMap.put(str2, new ArrayList<String>());
	      	multiValueMap.get(str2).add(strDate);
	      	multiValueMap.get(str2).add("not yet returned");
			hatchback.remove(str2);
			break;
		 }
			
	 }}
	protected void addcar(String str) {
		 System.out.println("Do you wish to 1.add a new car or\n2.return a car\n");
		 int m;
		 Scanner l= new Scanner( System.in );
    	 m=l.nextInt();
    	 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
          String endDate = dateFormat.format(date); 
		
		 System.out.println("Enter the categoryof the car\n1.SUV\n2.SEDAN\n3.Hatchback");
		 int s;
		 Scanner p= new Scanner(System.in);
		 s=p.nextInt();
		
		 System.out.print("Type the name of the car\n");
		Scanner sc1= new Scanner(System.in);
		String str1= sc1.nextLine();  
		System.out.print("Type the number plate of the car\n");
		String str3= sc1.nextLine();
		 switch(s) {
		 
		 case 1:
		 { HashMap<String, String> suv = x.getSuvMap();
			 suv.put(str1,str3);
			if(m==1)
			{		multiValueMap.put(str3, new ArrayList<String>());
	      	multiValueMap.get(str3).set(1,endDate);
	      	t.tracktime(str,str3);
	      
	      	
			}
				
				
			break;
		 }
		 case 2:
		 { HashMap<String, String> sedan = x.getSedanMap(); 
			sedan.put(str1,str3);
			if(m==1)
			{		multiValueMap.put(str3, new ArrayList<String>());
	      	multiValueMap.get(str3).set(1,endDate);
	      	t.tracktime(str,str3);
			}
				
			break;
		 }
		 case 3:
		 { HashMap<String, String> hatchback = x.getHatchbackMap();
			
				hatchback.put(str3,str1);
				if(m==1)
				{multiValueMap.put(str3, new ArrayList<String>());
		      	multiValueMap.get(str3).set(1,endDate);
				t.tracktime(str,str3);
				}
					
				break;
		 }}
		 
			 
		
	}}

		 
		 
	 
		
	
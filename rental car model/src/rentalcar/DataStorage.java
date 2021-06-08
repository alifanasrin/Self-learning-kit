package rentalcar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





 public class DataStorage {
    private HashMap<String, String> premiumpeople = new HashMap<String, String>();
    public HashMap<String, String> getPremiumpeopleMap() {
    	premiumpeople.put("124354","active");
    	premiumpeople.put("695930202","active");
    	premiumpeople.put("alifa@hotmail.gmail.com", "active");
    	
         return premiumpeople;
    }
    private HashMap<String, String> regularpeople = new HashMap<String, String>();
    public HashMap<String, String> getRegularpeopleMap() {
    	regularpeople.put("987209642","active");
    	regularpeople.put("heretorentcar@hotmail.com","active");
    	regularpeople.put("misba@hotmail.gmail.com", "active");
    	
         return regularpeople;
    }
    private HashMap<String, String> suv= new HashMap<String, String>();
    public HashMap<String, String> getSuvMap() {
    	suv.put("DL 11 CAA 1111","Mahindra Thar");
		suv.put("KA05B8622","Hyundai Creta");
		suv.put("KA05B8623","Kia Seltos");
		suv.put("KA05B8399","Mahindra Scorpio");
		suv.put("KA06B8622","Toyota Fortuner");
		suv.put("KA05B9622","Kia Sonet");
		suv.put("AP05B8622","Hyundai Venue");
		suv.put("KA05A8622","Maruti Vitara Brezza");
		suv.put("WB05B8622","Land Rover Range Rover");
		suv.put("KA03F5690","Tata Nexon");
		return suv;
    }
    private HashMap<String, String> sedan= new HashMap<String, String>();
    public HashMap<String, String> getSedanMap(){
    	sedan.put("TN76AZ1197","Honda City 4th Generation");
		sedan.put("PB76AZ1197","Maruti Dzire");
		sedan.put("KA76AZ1197","Hyundai Verna");
		sedan.put("KA89AZ1197","Honda City");
		sedan.put("KA89AZ2297","Hyundai Aura");
		sedan.put("KA89AZ27857","Honda Amaze");
		sedan.put("KA96bd1120","Hyundai Aura");
		sedan.put("WB89AZ2297","Toyota Yaris");
		sedan.put("KL67AZ2297","Toyota Camry");
		sedan.put("KL67AZ2297","Toyota Camry");
		 return sedan;
    }
    private HashMap<String, String> hatchback= new HashMap<String, String>();
    public HashMap<String, String> getHatchbackMap(){
    	hatchback.put("MH01AE8017","Maruti Swift" );
		hatchback.put("MH02AE8017","Hyundai i20" );
		hatchback.put( "MH22AE8019","Maruti Baleno");
		hatchback.put("MH02PE9017","Tata Altroz");
		hatchback.put( "MH00KJ8017","Maruti Wagon R");
		hatchback.put("MH89AE9017","Renault KWID");
		hatchback.put("MH34AE0017","Tata Tiago");
		hatchback.put( "KL02AE8017","Maruti Alto 800");
		hatchback.put("AP02AE8017","Volkswagen Polo");
		hatchback.put("WB92AE8017","Maruti Celerio");
		return hatchback;
    }
    private Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
    public 	Map<String, ArrayList<String>> gettmap(){
    	multiValueMap.put("alifa", new ArrayList<String>());
    	multiValueMap.get("alifa@hotmail.gmail.com").add("31/01/2020");
    	multiValueMap.get("alifa@hotmail.gmail.com").add("09/06/2020");
    	return multiValueMap;
   
    }
    
 }
 
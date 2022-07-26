import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();  
		  
		  map.put(1,"Siddiq");  
		  map.put(4,"Raju");  
		  map.put(3,"Anu");  
		  map.put(2,"Arun");  
		  System.out.println("\nHashtable");
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  
		HashMap<Integer,String> map1=new HashMap<Integer,String>();       
		   map1.put(21,"Cat");  
		   map1.put(24,"Dog");    
		   map1.put(22,"Cow");   
		   map1.put(23,"Lion");   
		       
		   System.out.println("\nHashmap");  
		   for(Map.Entry m : map1.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   
		   TreeMap<Integer,String> map2=new TreeMap<Integer,String>();    
		      map2.put(52,"Blue");    
		      map2.put(50,"Red");    
		      map2.put(54,"Green");    
		      map2.put(53,"Pink");    
		      System.out.println("\nTreemap"); 
		      for(Map.Entry m:map2.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    

	}

}

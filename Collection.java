
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Siddiq");
		list.add("Raju");
		list.add("Arun");
		list.add("Siddiq");
		System.out.println("ArrayList");
		System.out.println(list);
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Siddiq");
		list1.add("Anu");
		list1.add("Arun");
		list1.add("Anu");
		System.out.println("\nLinkedList");
		System.out.println(list1);
		list1.addFirst("Rohit");
		System.out.println(list1);
		
		Vector<Integer> list3 = new Vector<Integer>();
		list3.add(1);
		list3.add(35);
		list3.add(12);
		System.out.println("\nVector");
		Iterator itr=list3.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		

		HashSet<String> list4 = new HashSet<String>();
		list4.add("Siddiq");
		list4.add("Anu");
		list4.add("Arun");
		list4.add("Anu"); 
		System.out.println("\nHashSet");
		Iterator itr1=list4.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		
		
		LinkedHashSet<Integer> list5 = new LinkedHashSet<Integer>();
		list5.add(12);
		list5.add(67);
		list5.add(12);
		System.out.println("\nLinkedHashSet");
		System.out.println(list5);
	}

}

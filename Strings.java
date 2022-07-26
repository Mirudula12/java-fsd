public class StringExample {

	public static void main(String[] args) {
		
		String str="Java";
		String str1 ="Language";
	
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.toUpperCase());
		System.out.println(str.concat(str1));
	
		
		System.out.println("\nString Buffer:");
		String x="Python ";
		StringBuffer sb = new StringBuffer(x);
		sb.append("Coding");
		System.out.println(sb);
		
		sb.insert(1, "j");
		System.out.println(sb);
		
		sb.delete(3,6);
		System.out.println(sb);
		
	
		System.out.println("\nString Builder:");
		String y="Crash ";
		StringBuilder sb1 = new StringBuilder(y);
		sb1.append("Course");
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		
		String z="Good morning";
		StringBuffer sb2 = new StringBuffer(z);
		System.out.println("\nString to StringBuffer");
	    sb2.reverse(); 
	    System.out.println(sb2); 
	          
	      
	    StringBuilder sb3 = new StringBuilder(z); 
	    System.out.println("\nString to StringBuilder");
	    sb3.append("world"); 
	    System.out.println(sb3);         
		

	}

}

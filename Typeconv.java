
import java.util.*;
public class Typeconv {

	public static void main(String args[]) {
		
		char ch = 'j';
		int in = (int)ch;
		System.out.println("Widening Type conversion");
		System.out.println("ASCII value:" + in);
		
		
	 
		float f;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNarrowing Type conversion");
		System.out.println("Enter an integer:");
		f=sc.nextFloat();
		
		long l = (long) f;
		
		int i = (int) l;
		
		System.out.println("Float:" + f);
		System.out.println("Long:" + l);
		System.out.println("Integer:" + i);
	
		
		
	}

}

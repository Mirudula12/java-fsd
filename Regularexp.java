import java.util.regex.*;
import java.util.*;

public class Regexpr {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		String pattern="[A-Z0-9]*";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		
		while(m.find())
		{
			System.out.println(str.substring(m.start(), m.end()));
		}

	}

}

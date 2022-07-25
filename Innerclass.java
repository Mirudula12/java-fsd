class Outerclass {                                  //Nested inner class
	private int x=55;
	
	class Innerclass1 {
		public int innermethod() {
			return x;
		}
	}
}

public class Innerclass {                          //local inner class-class inside a method
     private int data=20;
	void display() {
		class Innerclass2 {
			void method1() {
				System.out.println("Local inner class: " + data);
			}
		
		}
		Innerclass2 in1 = new Innerclass2();
		in1.method1();
	}
	
	
	public static void main(String[] args) {
		
		Outerclass out = new Outerclass();
		Outerclass.Innerclass1 in = out.new Innerclass1();
		
		Innerclass i = new Innerclass();
		i.display();
		
		System.out.println("Nested Inner class: " + in.innermethod());

	}

}

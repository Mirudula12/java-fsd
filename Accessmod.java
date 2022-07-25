
class A {
	public void display3() {
		System.out.println("Public modifier");
	}
}


class B {
	protected void display() {
		System.out.println("Private modifier");
	}

}


class C {
	private String name;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


class D {
	void display2() {                              
		System.out.println("Default modifier");
	}
}


public class Accessmod extends B {
	public static void main(String args[])
	{
		A aa = new A();                         //public
		aa.display3();
		
		Accessmod bb = new Accessmod();         //protected
		bb.display();   
		
		C cc = new C();                         //private
		cc.setName("Siddiq");
		System.out.println(cc.getName());
		
		D dd = new D();                         //default
		dd.display2();
		
	}
	
}


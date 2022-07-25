//types of methods
//method overloading

public class Method {
	
	int a,b;
	
	int method1(int a,int b) {            //with return and with argument
		return a+b;
	}
	
	int method2() {                      //with return and without argument
		return a*b;
	}
	
	void method3(int a,int b,int c) {              //without return and with argument
	    System.out.println("Result:" + (a+b+c));
	}
	
	void method4() {                              //without return and without argument
		System.out.println("Result:" + (a/b));
	}
	
	
	public static void main(String args[]) {
		Method m = new Method();
		int res = m.method1(20,10);
		
		m.a=50;
		m.b=40;
		int res1 = m.method2();
		
		System.out.println(res);
		System.out.println(res1);
		m.method3(20, 10, 30);
		
		m.a=20;
		m.b=10;
		m.method4();		
		
	}
}

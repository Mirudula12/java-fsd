//types of constructor
//constructor overloading

public class Constructor {
	
	String name;
	int id;
	
	Constructor(String name,int id) {                //parameterized constructor
		this.name = name;
		this.id = id;
	}
	
	Constructor(int id) {             
		this.id = id;
	}
	
	
	void display() {
		System.out.println("Name:" + name + "\n" + "ID:" + id);
	}
	

	public static void main(String[] args) {
		   
          Constructor c = new Constructor("Siddiq", 1);
          Constructor c1 = new Constructor(2);
          
          
          c.display();
          c1.display();
          
          
	}

}

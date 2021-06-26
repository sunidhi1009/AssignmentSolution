
abstract class Shape {
	abstract void paint();  
	}    
	class Rectangle extends Shape{  
	void paint(){System.out.println("rectangle");}  
	}  
	class Circle extends Shape{  
	void paint(){System.out.println(" circle");}  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle s=new Circle(); 
		s.paint();
	}

}

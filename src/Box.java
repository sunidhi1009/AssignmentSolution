
public class Box {
   int len;
   int b;
   int height;
   
	
 void Boxdim(int len,int b,int h )
	{  System.out.println("by deafult dimensions");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
		
	}
	
 void Boxdim(float len,int b,int h )
	{System.out.println(" dimensions with float");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
	}
	
 void Boxdim(double len,int b,int h )
	{System.out.println("by double dimensions");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
	}
	
 void Boxdim(double len,double b,int h )
	{System.out.println("by double dimensions");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
	}

 void Boxdim(double len,float b,int h )
	{System.out.println("by double dimensions");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
	}
 
 void Boxdim(int len,int b,float h )
	{System.out.println("by double dimensions");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
	}
 void Boxdim(double len,int b,float h )
	{System.out.println("by double dimensions");
		System.out.println("box dimension is :"+len+"-"+b+"-"+height);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
Box b = new Box();
b.Boxdim(10, 20, 30);
b.Boxdim(10.0f,1,30);
b.Boxdim(200.0,10,30);
	}

}

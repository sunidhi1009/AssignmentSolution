
public class Mobile extends ElectonicGadget {
	String color;
	int size;
	Mobile()
	{super();
	System.out.println("defaut constructor mobile");
	color="white";
	size=25;
	}
	Mobile(String color,int size)
	{   
		super(10,"sony",8080,100,20000);
		this.color=color;
		this.size=size;
		System.out.println("para constructor mobile");
	}
	public void getDetails()
	{
		System.out.println("product mobile info is :"
	+productId+"-"+Productname+"-"+PortNo+"-"+ip+"-"+price+"-"+color+" size is ::"+size);
		
	}
	public static void main(String[] args) {
		ElectonicGadget object = new Mobile();
	    object.getDetails();
		ElectonicGadget obj = new Mobile("red",123);
	    obj.getDetails();
	}

}

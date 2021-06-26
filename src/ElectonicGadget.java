
public class ElectonicGadget {
	int productId;
	String Productname;
	int PortNo;
	int ip;
	int price;
	ElectonicGadget()
	{System.out.println("base class default ");
    productId=9;
	Productname="Iphone";
	PortNo=4200;
	ip=45;
	price=500000;
		
	}
	ElectonicGadget(int productId,String Productname,int PortNo,int ip,int price)
	{ System.out.println("base class para ");
		this.productId=productId;
	this.Productname=Productname;
	this.PortNo=PortNo;
	this.ip=ip;
	this.price=price;
		
	}
	public void getDetails()
	{
		System.out.println("product id is :"+productId+"-"+Productname+"-"+PortNo+"-"+ip+"-"+price);
		
	}
	public static void main(String[] args) {
	
		

		
		
		
		
	}

}

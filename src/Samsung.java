
public class Samsung extends Mobile {
    int totalprice;
    Samsung()
    {
    	totalprice=1000;
    }
    Samsung(int totalprice)
    {
    	this.totalprice=totalprice;
    }
    public void getDetails() {
    	System.out.println("total price is :"+totalprice);
    }
	public static void main(String[] args) {
	 Samsung o = new Samsung();
	 o.getDetails();
	}

}

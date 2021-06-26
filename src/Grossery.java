
public class Grossery {
   int itemNo;
	Grossery(int itemNo)
	{
		
		this.itemNo=itemNo;
	}
	

    int Add(int addedItem) {
		itemNo=itemNo+addedItem;
		System.out.println(" total items added"+itemNo);
		return itemNo;
	}
	
    int getDetails()
	{
		return  itemNo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grossery g = new Grossery(1000);
		
		UpdatedGrossery up = new UpdatedGrossery(g);
		up.Add(20);
	
		
	}
}
	 class UpdatedGrossery{
		Grossery g;
		UpdatedGrossery(Grossery num)
		{
			g=num;
		}
		int Add(int updated) {
			
			System.out.println(" total items added"+updated);
			System.out.println(" total items details"+g.getDetails());
			return updated;
		}
		
	}
	




public class TestThread {
	
	public static void main(String[] args) {
		UpdatedItem t = new UpdatedItem();
		t.ItemList();
	}

}
interface Product
{
	 void itemslist();
}

class Items {
	public void ItemList()
	{
		System.out.println("item listed");
	}
	void start()
	{
		System.out.println("Talking to JVM thread scheduler...");
		ItemList();
		System.out.println("Talk is over...");
	}
}
class UpdatedItem extends Items{
	public void ItemList() {
		System.out.println("updated items are :");
	}
}
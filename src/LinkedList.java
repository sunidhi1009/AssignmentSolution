import java.util.Iterator;
class Customer
{
	String Name;
	int MobileNo;
	String Email;
	public Customer(String Name, int Mobile, String Email) {
		super();
		this.Name =Name;
		this.MobileNo = MobileNo;
		this.Email = Email;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + Name + ", Mobile=" + MobileNo + ",Email="
				+ Email + "]";
	}
	
	
}
public class LinkedList {   
	public static void main(String[] args) {
		Customer c1 = new Customer("Vishhal", 8204434, "vishalviniing@gmail.com");
		Customer c2= new Customer("Deven", 20448464, "deve@gmail.com");
		Customer c3 = new Customer("ayush", 20449464, "jayesh@gmail.com");
		Customer c4 = new Customer("Milind", 720443064, "milind@gmail.com");
		
		System.out.println("Content is ready........");
		
		System.out.println("Making the Container....");
		LinkedList myPhoneBook = new LinkedList ();
		System.out.println("Container....is ready...");
		
		System.out.println("Adding the Content in the Container....");
		myPhoneBook.add(c1);
		myPhoneBook.add(c2);
		myPhoneBook.add(c3);
		myPhoneBook.add(c4);
		
		System.out.println("Added all the Content in the Container....");
		
		System.out.println("Retriving the Iterator from the Container....");
		Iterator myIterator = myPhoneBook.iterator();
		System.out.println("Iterating through the Container....");
		while(myIterator.hasNext())
		{
			Object o = myIterator.next(); // windows button and + <---zoom in
							//windows button and - <---zoom out
			Customer x = (Customer) o; // casting of Object to Song
			System.out.println("Contact : "+x);
		}
		
		System.out.println("End of main....");
		

	}

	private Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(Customer c1) {
		// TODO Auto-generated method stub
		
	}

}

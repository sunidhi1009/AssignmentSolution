class  Price{
	String itemName;
	int cost;
	int pid;
	public Price(String name,int cost ,int pid)
	{
		this.itemName=name;
		this.cost=cost;
		this.pid=pid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + pid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (pid != other.pid)
			return false;
		return true;
	}
	
	
}

public class HashCode {

	public static void main(String[] args) {
	Price p = new Price("the secret",30,101);
	HashSet <Price>= HashSet <Price>();
	
	
	}
	

}


public class GenericEx<T>{
	T data;
	T getdata()
	{
	return data;
	}
	void setdata(T data)
	{
		this.data=data;
	}
	<T> void displayData(T data)
	{
		System.out.println("data is -"+data);
	}
    
	public static void main(String[] args) {
		 GenericEx t = new  GenericEx();
		 t.setdata(14);
		 t.getdata();
		 t.displayData(44);
	}

}

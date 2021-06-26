interface computer
{
	void test();
}
interface laptop
{
	void test();
}

public class  MultipleInterface implements computer,laptop {
	public void test() {
		System.out.println("laptop n computer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultipleInterface m = new  MultipleInterface();
		 m.test();
	}

}

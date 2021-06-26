class Printer{
	
	void PrintDocumemnt(int numOfCopies,String docName) {
		
		
		for(int i=1;i<=numOfCopies;i++)
		{
			System.out.println("printing "+docName+""+i);
		}
	}
}
class MyThread extends Thread{
	Printer pRef;
	MyThread(Printer p)
	
	{
	pRef=p;
	}
	@Override
	public void run() {
		pRef.PrintDocumemnt(10,"surbhi's Profile");	
	}
}
public class SyncApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Printer p = new Printer();
p.PrintDocumemnt(10,"sunidhi.pdf");
MyThread mRef = new MyThread(p);
mRef.start();
	}

}

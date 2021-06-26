class MyTask extends CA implements Runnable {
	public void run()
	{
		for(int doc=1;doc<=10;doc++)
		{
			System.out.println("@@printing document  #"+doc+"-printer2");
		}

	}
	}
class CA{
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("application started");
MyTask task = new MyTask();
//task.start();
Runnable r = new MyTask();
Thread t = new Thread(r);
t.start();
for(int doc=1;doc<=10;doc++)
{
	System.out.println("printing document  #"+doc);
}

System.out.println("application finished");

	}

}

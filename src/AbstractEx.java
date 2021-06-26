//abstract class ex
public abstract class AbstractEx {
	int sal;
	int days;
	AbstractEx(){
		System.out.println("default constrcutor");
	}
	void accept(int sal , int days)
	{
		this.sal=sal;
		this.days=days;
	}
	abstract int work(int days);
	abstract int performance(int sal);
	

}
	 class Report extends AbstractEx{
		int work(int days) {
			days=days+20;
			System.out.println(days);
			return days;
		}
		int performance(int sal) {
			sal=sal+3000;
			System.out.println(sal);
			return sal;
		}
		
 
class Result extends Report {
	Result()
	{
		System.out.println("in deafult of Result constrctor");
	}

	 void display()
	 {  
	 	System.out.println("salary is ::"+sal);
		System.out.println("days  is ::"+days);
	 	
	 }
}		

public static void main(String[] args) {
	
	// TODO Auto-generated method stub
Report r = new Report();
r.accept(10,20);
r.work(30);
r.performance(30);

Result r1 = new Result();
r1.display();
}
	 }

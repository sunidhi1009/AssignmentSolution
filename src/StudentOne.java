import java.util.Scanner;

public class StudentOne extends Student1
{
   void acceptData()
   {Scanner sc= new Scanner(System.in);
	   System.out.println("accept data ");
	   
	   name=sc.next();
	   Stream=sc.next();
	   
	   age=sc.nextInt();
	   perDegree=sc.nextDouble();
   }
   void display()
   {
	   System.out.println(name);
		System.out.println(Stream);
		System.out.println(age);
		System.out.println(perDegree);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

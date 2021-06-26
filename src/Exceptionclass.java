import java.util.Scanner;

public class Exceptionclass {

	public static void main(String[] args) {
 class Customer{
	 int id;
	 String name;
	 int age;
	Customer()
	{
		System.out.println("in ctor");
	}
	Customer (int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	try
	 {   void getdetails()
		 {
			 getRegistered();
		 }
	 void getRegistered()
	 {
		 System.out.println("eneter details");
		 Scanner sc = new Scanner(System.in);
		 id = sc.nextInt();
		 name=sc.next();
		 age=sc.nextInt();
		  System.out.println("registeration successful");  
	 }
		
	 } 
 }
	
 
 try 
	 { 
		 Customer c = new Customer();
		 c.getdetails();
	 }
	 
	
	 catch
	 {
		 System.out.println("no details found");
	 }
	 catch(NameRegisterException e) {
			System.out.println("Problem is id :"+e); //Exception class + Message
		}
		catch(IdExceptionException e) {
			System.out.println("Problem in name :"+e);
		}
		catch(ageException e) {
			System.out.println("Problem in age :"+e);
		}
		
	
public class NameRegisterException extends  RuntimeExceptione  {
	NameRegisterException(String name)
	{
		super(msg);
	}
	 
}
	 
	 
class IdExceptionException extends  RuntimeExceptione {
	IdExceptionException(int id)
	{
		super(id);
	}
	 
}

class ageExceptionException extends  RuntimeExceptione {
	ageExceptionException(int id)
	{
		super(id);
	}
	 
}
 }

}

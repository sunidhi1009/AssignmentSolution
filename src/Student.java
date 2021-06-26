
abstract class Student {
	int id ;
	String name;
	int mobile;
	String College;
	//abstract void Details();
	abstract void work();
  Student()
  {
	  id=0 ;
	name="No NAME";
	mobile=123;
	College="NOT ATTENDED COLLEGE";
		
  }
 
  Student(int id,String name,int mobile,String College)
  {  
	this.id=id ;
    this.name=name;
	this.mobile=mobile;
	this.College=College;
  }
  
  void Display()
  {
	  System.out.println("ID :"+id);
	  System.out.println("NAME :"+name);
	  System.out.println("MOBILE:"+mobile);
	  System.out.println("COLLEGE:"+College);
  }
  public static void main(String []args)
  {
	  //Student obj = new Student();
		//obj.Display();
		//Student s = new Student(101,"Sunidhi",236328,"CDAC");
		//s.Display();
		System.out.println("*********************");
	    Employee e = new Employee(1,"priya",123,"RGTU",100,"Surbhi",50000);
	    e.Display();
	    e.work();
	    System.out.println("*********************");
	    Exceutive ee = new Exceutive();
	    ee.Display();
	  
  }
}
  class Employee extends Student{
	  int Eid;
	  String Ename;
	  int Sal;
	  Employee(){
		  super();
		  
		  int Eid=0;
		  String Ename=null;
		  int Sal=0;
	  }
	  Employee(int id,String name,int mobile,String College,int Eid,String Ename,int Sal){
		  super(id,name,mobile,College);
		  this.Eid=Eid;
		  this.Ename=Ename;
		  this.Sal=Sal;
	  }
	  void Display()
	  {
		  System.out.println("ID :"+Eid);
		  System.out.println("NAME :"+Ename);
		  System.out.println("SALARY"+Sal);
		  
	  }
   void work(){
		
		 Sal=Sal*20;
	  }
    
  
	public static void main(String[] args) {
	
	}
  }
	class Exceutive extends Employee{
		
		int BasicPay;
		String Designation;
		
		 Exceutive(){
			 super();
			 BasicPay=100000;
			 Designation="Exectuive Engineer";
			 
		 }
		 Exceutive(int id,String name,int mobile,String College,int Eid,String Ename,int Sal,
				 int BasicPay,String Designation){
			 super();
			 this.BasicPay=BasicPay;
			 this.Designation=Designation;
		
		 
	}
		 public void Display()
			{
				System.out.println("BASIC PAYMENT :"+BasicPay);
				  System.out.println("NAME :"+Designation);
			}
}
	

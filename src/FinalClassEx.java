import java.util.Scanner;

public  class FinalClassEx {
    String empname;
     int id;
    String PanCard;
     int sal;
    static final String Org="Intellect";
    void FinalClassEx()
    {
    	System.out.println("enter details");
    	Scanner sc = new Scanner(System.in);
    	empname=sc.next();
    	id = sc.nextInt();
    	PanCard=sc.next();
    	
    	sal=sc.nextInt();
    	
   
    }
    
    public String toString()
    {
    return "name is :"+empname
    		+ " id is :"+id
    		+ "Pancard is :"+PanCard
    		+ "Salary is ::"+sal
    		+"oraganisation is :"+Org;
       }
    
	public static void main(String[] args) {
		FinalClassEx ex = new FinalClassEx();
		ex.FinalClassEx();
		System.out.println(ex.toString());
		
		FinalClassEx ex1 = new EmpFeedback();
		ex1.toString();
		ex1.details();

	}
}
	class EmpFeedback extends FinalClassEx {
		final void details()
		{
			super.FinalClassEx();
		}
	}

}

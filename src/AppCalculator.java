import java.util.Scanner;

public class AppCalculator {
    int data;
    int num;
   
    Scanner sc = new Scanner(System.in);
    int age=sc.nextInt();
    AppCalculator(){
    	int data =100;
    	
    }
    AppCalculator(int data){
    	this.data =data;
    }
    
     int add()
     {  
    	 if (age>18)
    		 {
    		 System.out.println(" elligible to vote"+age);
    		 }
    	 else {
    		 System.out.println("not elligible to vote");
    	 }
    	 return age;
     }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}

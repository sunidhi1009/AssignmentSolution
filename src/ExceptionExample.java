import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);

	for(int i=0;i<arr.length;i++)
	{
	arr[i]=sc.nextInt();
	}
			
	try {
		int i=1;
		 arr[0]='\0';
		System.out.println("array not exists"+arr);
		
		
		try{
			System.out.println("enter the index");
			
			int index=sc.nextInt();
			
			if(index>arr.length) {
				System.out.println(" Arry index out of bound");
			}
		}


			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("return index");
			}

			}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("no array exists");
	}
	}
	


	}

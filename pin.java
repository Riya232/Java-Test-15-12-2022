import java.util.Scanner;
public class pinCheck{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 2302;
		int count = 0;
		
		
		
		for(int i = 0; i<=3 ; i++)
			{
		       System.out.println("Enter Your Pin: ");
		       int password= sc.nextInt();
		
		  if(password == pin)
		{
			System.out.println("Correct, welcome back.");
			break;
		}
		  else {
			  count++;
			  if(count>=3) {
				  System.out.println("Sorry but you have been locked out.");
			  }
			  System.out.println("Incorrect, try again.");
		  }
	        

	}
	}
}

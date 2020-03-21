import java.util.Scanner;

public class UserInput {
	// int number;
	 public  int getInput() {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Inser the number: ");

if  (input.hasNextInt()) {
	// number = input.nextInt();
   return input.nextInt(); 
	
}  else {
	System.out.println("Enter correct number");
	return getInput();
}
	 }
}
	 
	




	

	


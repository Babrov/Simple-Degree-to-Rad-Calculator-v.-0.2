
public class CalculatorTest { 
	public static void main (String args[]) {
		
		UserInput input = new UserInput();
		
		Calculator calctest = new Calculator();
		
		int degree = input.getInput();
		calctest.setDeg(degree);
		double radian = calctest.getRad();	
		System.out.println(radian);
	}

}

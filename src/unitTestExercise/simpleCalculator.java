package unitTestExercise;
import java.util.Scanner;

public class simpleCalculator {


	public int Add(int a, int b) {
		return a+b;
	}	
	public int Sub(int a, int b) {
		return a-b;
	}
	public int Mul(int a, int b) {
		return a*b;
	}
	public int Div(int a, int b) {
		return a/b;
	}
	
	
	public static void main(String args[]) {
		simpleCalculator calc=new simpleCalculator();
		Scanner scanner=new Scanner(System.in);
		int a, b, result=0;
		char operator='+';
		
		System.out.print("Enter 1st number: ");
		a=scanner.nextInt();
		
		System.out.print("Enter 2nd number: ");
		b=scanner.nextInt();
		
		do {
		System.out.println("Choose an operation:");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("'e' to exit.");
		operator=scanner.next().charAt(0);
		
		if(operator=='+')
			result = calc.Add(a, b);
		else if(operator=='-')
			result = calc.Sub(a, b);
		else if(operator=='*')
			result = calc.Mul(a, b);
		else if(operator=='/')
			result = calc.Div(a, b);
		System.out.printf("Result is: %d\n", result);
		}while(operator!='e');
				
		scanner.close();
	}
}


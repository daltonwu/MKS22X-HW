import java.util.Scanner;

public class StackCalc {
	public static boolean isOperator(char c) {
		return "-+*/".contains(String.valueOf(c));
	}
	
	public static int getPriority(char op) {
		return ("-+".contains(String.valueOf(op)) ? 1 : 2);
	}
	
	public static String toPostfix(String infix) {
		LStack<Character> ops = new LStack<Character>();
		String postfix = "";
		
		for(int i=0; i<infix.length(); i++) {
			char c = infix.charAt(i);
			if(isOperator(c)) {
				while(!ops.isEmpty() && getPriority(c) <= getPriority(ops.peek())) {
					postfix += ops.pop();
				}
				ops.push(c);
			}
			else {
				postfix += c;
			}
		}
		
		while(!ops.isEmpty()) {
			postfix += ops.pop();
		}
		
		return postfix;
	}
	
	public static double evaluate(double a, double b, char operator) {
		switch(operator) {
			case '+':	return a+b;
			case '-':	return a-b;
			case '*':	return a*b;
			default:	return a/b;
		}
	}
	
	public static double calculate(String postfix) {
		LStack<Double> values = new LStack<Double>();
		
		for(int i=0; i<postfix.length(); i++) {
			char c = postfix.charAt(i);
			if(isOperator(c)) {	
				double b = values.pop();
				double a = values.pop();
				values.push(evaluate(a, b, c));
			}
			else {
				values.push((double) Character.getNumericValue(c));
			}
		}
		
		return values.pop();
	}
	
	public static void main(String[] args) {
		String s = "4+3*6/2";
		String p = toPostfix(s);
		
		System.out.println(p);
		
		System.out.println(calculate(p) + "\n\n[1mNow input more things![0m (Keep in mind, roughly 15 to 17 decimal sig figs.)");
		
		while(true) {
			Scanner input = new Scanner(System.in);
			s = input.nextLine();
			p = toPostfix(s);
			System.out.println("[37;40mrpn: " + p + "[0m");
			System.out.println("[30;47mans: " + calculate(p) + "[0m\n");
		}
	}
}

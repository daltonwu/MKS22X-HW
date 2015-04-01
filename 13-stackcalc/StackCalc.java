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
				if(ops.isEmpty()) {
					ops.push(c);
				}
				else {
					while(!ops.isEmpty() && getPriority(ops.peek()) >= getPriority(c)) {
						postfix += ops.pop();
					}
				}
			}
		}
		
		while(!ops.isEmpty()) {
			postfix += ops.pop();
		}
		
		return postfix;
	}
	
	public static double evaluate(double b, double a, char operator) {
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
				double a = values.pop();
				double b = values.pop();
				values.push(evaluate(b, a, c));
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
		
		//System.out.println(calculate(p));
	}
}

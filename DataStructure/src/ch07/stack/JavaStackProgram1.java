package ch07.stack;

public class JavaStackProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp opt = new OptExp();
		String exp = "(3+5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!!");
		
		postfix = opt.toPostfix(exp);
		System.out.printf("\n후위표기식: ");
		System.out.println(postfix);
	}

}

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
			System.out.println("��ȣ ����!");
		else
			System.out.println("��ȣ Ʋ��!!");
		
		postfix = opt.toPostfix(exp);
		System.out.printf("\n����ǥ���: ");
		System.out.println(postfix);
	}

}

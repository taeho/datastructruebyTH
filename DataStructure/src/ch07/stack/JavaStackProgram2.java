package ch07.stack;

public class JavaStackProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("����ǥ���: %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n������ : %d ", result);
	}

}

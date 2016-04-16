package ch07.stack;

/*
 * 1. ���� �ڷᱸ�� ����� �̿��Ͽ� ������ ���� ���α׷�.
 * 
 * ���� �ڷᱸ���� 1���� �迭�� �̿��Ͽ� ���� ����.
 * 1���� �迭 stack[n]�� ����� �� n�� �迭 ũ��μ� �迭 ������ ������ ��Ÿ���µ�,
 * �̰��� ������ ũ�Ⱑ �ȴ�. 
 * ���ÿ� ���Ұ� ���̴� ������ �迭�� �ε���(index)�� ǥ���Ѵ�.
 * ���� ������ ù ��° ���Ҵ� stack[0]�� �����ϰ�, ������ �� ��° ���Ҵ� stack[1]�� �����ϰ�,
 * ������ i ��° ���Ҵ� stack[i-1]�� �����Ѵ�.
 * 
 * */

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		S.printStack();
		
		S.push('C');
		S.printStack();
		
		deletedItem = S.pop();
		if(deletedItem != 0){
			System.out.println("Deleted Item : " + deletedItem);
		}
		S.printStack();
		
	}

}

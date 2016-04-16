package ch07.stack;

/*
 * 2. ���� �ڷᱸ�� ����� �̿��� ������ ����
 * 
 * ���� �ڷᱸ���� �̿��� ������ �迭�� ����Ͽ� �����ϱ�� ������, ���������� ũ�Ⱑ ������
 * �迭�� ����ϱ� ������ ������ ũ�⸦ �����ϱⰡ ��ư�, �޸��� ���� ���� �� �ִٴ�
 * ������ �ִ�. �̷��� ���� �ڷᱸ�� ����� ������ ���� �ڷᱸ�� ����� �̿������ν� �ذ��� �� ����.
 * 
 * ���� �ڷᱸ������� �ܼ� ���� ����Ʈ�� �̿��Ͽ� ������ �����ϸ�
 * ������ ���Ҵ� ���Ḯ��Ʈ�� ��尡 �ȴ�. ���ÿ� ���Ҹ� ������ ������ ���� ����Ʈ�� ��带 �ϳ���
 * �����Ѵ�. �׸��� ���� ���ҵ鰣�� ������ ���� ����Ʈ ����� ��ũ�� ����Ͽ� ǥ�� �Ѵ�.
 * ������ top�� ǥ���ϱ� ���ؼ� ���� ���� top�� ����Ѵ�.
 * 
 * */

public class JavaStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();

		deletedItem = LS.pop();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LS.printStack();
	}

}

package ch07.stack;


/*
 * ����/����  �ڷᱸ�� ����� �̿��Ͽ� ������ ���� ���α׷�.
 * */

public interface Stack {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();

}

package ch07.stack;


/*
 * 순차/연결  자료구조 방식을 이용하여 구현한 스택 프로그램.
 * */

public interface Stack {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();

}

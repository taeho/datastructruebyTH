package ch07.stack;

/*
 * 1. 순차 자료구조 방식을 이용하여 구현한 스택 프로그램.
 * 
 * 순차 자료구조인 1차원 배열을 이용하여 스택 구현.
 * 1차원 배열 stack[n]을 사용할 때 n은 배열 크기로서 배열 원소의 개수를 나타내는데,
 * 이것이 스택의 크기가 된다. 
 * 스택에 원소가 쌓이는 순서는 배열의 인덱스(index)로 표현한다.
 * 따라서 스택의 첫 번째 원소는 stack[0]에 저장하고, 스택의 두 번째 원소는 stack[1]에 저장하고,
 * 스택의 i 번째 원소는 stack[i-1]에 저장한다.
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

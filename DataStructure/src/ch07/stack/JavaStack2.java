package ch07.stack;

/*
 * 2. 연결 자료구조 방식을 이용한 스택의 구현
 * 
 * 순차 자료구조를 이용한 스택은 배열을 사용하여 구현하기는 쉽지만, 물리적으로 크기가 고정된
 * 배열을 사용하기 때문의 스택의 크기를 변경하기가 어렵고, 메모리의 낭비가 생길 수 있다는
 * 문제가 있다. 이러한 순차 자료구조 방식의 문제는 연결 자료구조 방식을 이용함으로써 해결할 수 있음.
 * 
 * 연결 자료구조방식의 단순 연결 리스트를 이용하여 스택을 구현하면
 * 스택의 원소는 연결리스트의 노드가 된다. 스택에 원소를 삽입할 때마다 연결 리스트에 노드를 하나씩
 * 연결한다. 그리고 스택 원소들간의 순서는 연결 리스트 노드의 링크를 사용하여 표현 한다.
 * 스택의 top을 표현하기 위해서 참조 변수 top을 사용한다.
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

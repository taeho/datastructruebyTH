package ch07.stack.stack.arry;

/*
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%8A%A4%ED%83%9DStack-%EB%B0%B0%EC%97%B4-%EA%B8%B0%EB%B0%98
 * ���� �迭���
 * http://cky5122.blog.me/80149999833
 *  - �����͸� ���ʳ� ¤���̿� ���� �׾Ƴ��� ����
 *  - �����͸� ���Խ� ���� �Ʒ����� ���̸� �ֽ� �����ʹ� ������ ���� �� �κп� ��ġ�Ѵ�.
 *  - �����͸� ����(����)�� ������ ���� �� �κп��� �����Ƿ� LIFO(Last-In, First-Out) �����̴�.
 *  - ������ ������ �迭 ��� �Ǵ� ��ũ�帮��Ʈ ������� ������ �����ϴ�.
 *  - �迭 ����� ������ ��� ������ ũ�Ⱑ ������ �ִ�.
 * */

public class Stack {
	
	private Node nodes[];
	private int capacity;
	private int top;
	
	// ������
	public Stack(int capacity){
		// �ʱ�ȭ
		nodes = new Node[capacity];
		for(int i=0; i<capacity; i++){
			nodes[i] = new Node();
		}
		this.capacity = capacity;
		top = 0;
	}
	
	// ����
	public void push(int data){
		nodes[top].data = data;
		top++;
	}
	
	// ����
	public int pop(){
		//���� top�� ���� index +1�� �����̹Ƿ�
		return nodes[--top].data;
	}
	
	// �뷮��ȯ
	public int capacity(){
		return capacity;
	}
	
	// �ֻ��� ��� ��ȯ
	public int top(){
		return nodes[top-1].data;
	}
	
	// ������
	public int size(){
		return top;
	}
	
	// ����ִ��� Ȯ��
	public boolean isEmpty(){
		return top == 0;
	}
	
	// ���� á���� Ȯ��
	public boolean isFull(){
		return capacity == top;
	} 

}

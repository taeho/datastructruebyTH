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

public class LinkedStack implements Stack {
	
	private StackNode top;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item: " + item);		
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail!! Linked Stack is empty!!");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail!! Linked Stack is empty!!");
			
		} else {			
			top = top.link;			
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail!! Linked Stack is empty!!");
			return 0;
		} else {			
			return top.data;
		}
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.println("Deleting Fail!! Linked Stack is empty!!");			
		} else {
			StackNode temp = top;
			System.out.println("Linked Stack >> ");
			while(temp != null){
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
	

}

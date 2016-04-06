package ch07.stack.stack.link;
/*
 * http://warmz.tistory.com/entry/�ڷᱸ��-����Stack-��ũ�帮��Ʈ-���
 *  - �ڼ��� ������ �Ʒ� ��ũ����...
 *   http://warmz.tistory.com/612
 *  - ��ũ�帮��Ʈ ����� ������ �뷮�� ������ ������ ���ɻ� ����Ž���� �����ؾ� �Ѵ�.
 *  - ��ũ�帮��Ʈ ����� ������ �̿��Ͽ� ��Ģ���� ����� ���� ���α׷��� ���� �� �ִ�.
 * */

public class Stack {
	Node top;	// tail. ������ �� ��
	Node list;	// head. ������ �� �Ʒ�
	
	// ����
	public void push(Node newNode){
		if(list == null){
			list = newNode;
		} else {
			// �ֻ��� ��带 ã�� newNode�� ����
			Node currentTop = list;
			while(currentTop.nextNode != null){
				currentTop = currentTop.nextNode;
			}
			currentTop.nextNode =newNode;
		}
		top = newNode;
	}
	
	// ����
	public Node pop(){
		//��ȯ�� �ֻ��� ���
		Node popped = top;
		
		// ���� ��带 ��� ��ȯ�ߴٸ�
		if(list == top){
			top = null;
			list = null;
		} else {
			// ���ο� �ֻ��� ��带 ������ top �ʵ忡 ���
			Node currentTop = list;
			while(currentTop != null && currentTop.nextNode != popped ){
				currentTop = currentTop.nextNode;
			}
			// ���� ������ top ����
			top = currentTop;
			// ���� ������ top�� nextNode ���� ����
			currentTop.nextNode = null;
		}
		return popped;
	}
	
	// �ֻ��� ��� ��ȯ
	public Node top(){
		return top;
	}
	
	// ���� ������ ��ȯ
	public int getSize(){
		int count = 0;
		
		Node current = list;
		while(current != null){
			current = current.nextNode;
			count++;
		}		
		return count;
	}
	
	// ������ ��� �ִ���
	public boolean isEmpty(){
		return (list ==null);
	}
}

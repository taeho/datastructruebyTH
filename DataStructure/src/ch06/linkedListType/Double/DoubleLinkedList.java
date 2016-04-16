package ch06.linkedListType.Double;

/*
 * [�ڷᱸ��] ����ũ�帮��Ʈ(���߿��Ḯ��Ʈ) - DoubleLinkedList
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EB%8D%94%EB%B8%94%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%EC%9D%B4%EC%A4%91%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8-DoubleLinkedList
 *  - ��ũ�帮��Ʈ ��������
 *  - ������ ��ũ�帮��Ʈ�� �ܹ������θ� Ž���� �� ������ 
 *     ����ũ�帮��Ʈ�� ���� ����� �ּҵ� ������ �����Ƿ� ����� Ž���� �����ϴ�
 *  - �ð� ���⵵ : O(n)
 *  http://cky5122.blog.me/80149935892
 * */

public class DoubleLinkedList {
	private Node head;
	
	// ��� �߰� �Լ�
	public void add(Node newNode){
		if(head == null){
			head = newNode;
		} else {
			Node tail = head;
			while(tail.nextNode != null){
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
			newNode.prevNode = tail;
		}
	}
	
	// ��� �߰� �Լ� ( ����� ��ġ )
	public void add(Node newNode, int location){
		// ��� ��ġ�� ���� �� ���
		if(location == 0){
			newNode.nextNode = head;
			head.prevNode = newNode;
			head = newNode;
		} else {
			Node before = head;
			// ���� ��带 ã�� ����
			while((--location) >0 ){
				before = before.nextNode;
			}
			// before ��尡 tail �ϼ��� �����Ƿ�
			if(before.nextNode != null){
				before.nextNode.prevNode = newNode;
			}
			
			newNode.prevNode = before;
			newNode.nextNode = before.nextNode;
			before.nextNode = newNode;
		}
	}
	
	// ��� Ž��
	public Node get(int location){
		Node current = head;
		
		while((--location) >= 0){
			current = current.nextNode;
		}
		
		return current;
	}
	
	// ��� ����
	public void remove(int location){
		// ������ ��尡 ����̸�
		if(location ==0){
			head = head.nextNode;
			if(head != null){
				head.prevNode = null;
			}
		} else {
			Node before = head;
			while((--location) > 0){
				before = before.nextNode;
			}
			
			Node after = before.nextNode.nextNode;
			if(after != null) {
				before.nextNode = after;
				after.prevNode = before;
			} else {
				before.nextNode = null;
			}
		}
	}
	
	// ��� ���� ���
	public void print(){
		StringBuffer sb = new StringBuffer();
		Node current  = head;
		int size = 0;
		
		while(current != null){
			sb.append(current.data);
			sb.append(", ");
			current = current.nextNode;
			size++;			
		}
		
		int i = sb.lastIndexOf(", ");
		sb.delete(i, i+2);
		
		System.out.println("[ "+ sb +" ]");
		System.out.println("size : " + size);
	}

}

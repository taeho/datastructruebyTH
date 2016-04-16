package ch06.linkedListType.Circular;

public class CircularDoubleLinkedList {
	
	private Node head;
	
	//��� �߰� �Լ�
	public void add(Node newNode){
		if(head == null){
			head = newNode;
			head.prevNode = head;
			head.nextNode = head;
		} else {
			Node tail = head.prevNode;
			
			tail.nextNode = newNode;
			head.prevNode = newNode;
			
			newNode.prevNode = tail;
			newNode.nextNode = head;	
		}		
	}
	
	// ��� �߰� �Լ� ( ������ ��ġ )
	public void add(Node newNode, int location){
		// ��� ��ġ�� ���Ե� ���
		if(location == 0){
			newNode.nextNode = head;
			newNode.prevNode = head.prevNode; // ����
			head.prevNode = newNode;
			newNode.prevNode.nextNode = newNode;
			head = newNode;			
		} else {
			Node before = head;
			// ���� ��带 ã�� ����
			while((--location) > 0){
				before = before.nextNode;
			}
			
			newNode.prevNode = before;
			newNode.nextNode = before.nextNode;
			
			before.nextNode = newNode;
			newNode.nextNode.prevNode = newNode;
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
		if(location == 0){
			head.prevNode.nextNode = head.nextNode;
			head.nextNode.prevNode = head.prevNode;
			head = head.nextNode;
		} else {
			Node before = head;
			while((--location)>0){
				before = before.nextNode;
			}
			before.nextNode = before.nextNode.nextNode;
			before.nextNode.prevNode = before;
		}
	}

	// ��� ������
	public int size(){
		Node current = head;
		int size = 0;
		
		while(current != null){
			current = current.nextNode;
			size++;
			if(current == head)
				break;
		}
		return size;
	}
}

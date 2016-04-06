package ch06.linkedListType.link;
/*
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8-LinkedList
 * http://cky5122.blog.me/80146918953 
 * �ڷᱸ��] ��ũ�帮��Ʈ(���Ḯ��Ʈ) - LinkedList
 *  - ���(Node)�� �����ؼ� ������� ����Ʈ
 *  - ������ �迭�� ������ ������ �־�� �ϳ�(�������� �ְ� ���Ƽ� �������� �����Ƿ� ��ȿ����) ��ũ�帮��Ʈ��
 *      ���α׷� ���� �߿��� �޸𸮸� �������� �Ҵ�޾� �ʿ��Ѹ�ŭ �����͸� ������ �� �ִ�.
 *  - ���� ������, ���� ��忡 ���� �޸� �ּҰ� ����� �ִ�.
 *   - �ð� ���⵵ : O(n)
 *   
 *  ����
 *  - ���ο� ����� �߰�/����/������ ���� ������
 *  - ���� ����� ���� ��带 ������ ���꿡 ���ؼ���  ����� �߻����� �ʴ´�.     
 *  ����
 *  - ���� ��带 ����Ű���� ������ ������ �� ��帶�� 4byte��  �޸𸮰� �߰��� �ʿ��ϴ�.
 *  - Ư�� ��ġ�� �ִ� ��带 ��µ� ��� ����� ũ�� �ӵ���  ������. 
 *  ����� ������ n �̶�� �־��� ��� 
 *  nȸ�� ���  Ž�� ������ �����ؾ� Ư�� ��ġ�� �ִ� ��带 ã�� �� �ִ�. 
 * */

public class LinkedList {
	
	private Node head;
	
	// ��� �߰�
	public void add(Node newNode){
		if(head == null){
			head = newNode;			
		} else {
			Node tail = head;
			while(tail.nextNode != null){
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
		}
	}
	
	// ��� �߰� �Լ� (������ ��ġ)
	public void add(Node newNode, int location){
		// �����ġ�� ���� �� ���
		if(location == 0){
			newNode.nextNode = head;
			head = newNode;
		} else {
			Node before = head;
			// ���� ��带 ã�� ����
			while((--location) > 0){
				before = before.nextNode;
			}
			newNode.nextNode = before.nextNode;
			before.nextNode = newNode;
		}
	}
	
	// ��� Ž��
	public Node get(int location){
		Node current = head;
		
		while((--location)>= 0 ){
			current = current.nextNode;
		}
		return current;
	}
	
	// ��� ����
	public void remove(int location){
		// ������ ��尡 ����̸�
		if(location == 0){
			 head = head.nextNode;
		} else {
			Node before = head;
			while((--location ) >0){
				before = before.nextNode;
			}
			Node after = before.nextNode.nextNode;
			if(after != null){
				before.nextNode = after;
			} else {
				before.nextNode = null;
			}
		}
	}
	
	// ��� ���� ���
	public void print(){
		StringBuffer sb = new StringBuffer();
		Node current = head;
		int size = 0;
		
		while(current != null) {
			sb.append(current.data);
			sb.append(", ");
			current = current.nextNode;
			size++;
		}
		
		int i = sb.lastIndexOf(", ");
		sb.delete(i, i+2);
		
		System.out.println("[" + sb + "]");
		System.out.println("size = "+ size);
	}

}

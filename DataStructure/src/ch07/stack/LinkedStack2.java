package ch07.stack;

public class LinkedStack2 {
	
	private StackNode2 top;

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	public void push(int item) {
		// TODO Auto-generated method stub
		StackNode2 newNode = new StackNode2();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
				
	}

	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail!! Linked Stack is empty!!");
			return 0;
		} else {
			int item = top.data;
			top = top.link;
			return item;
		}		
	}
	

}

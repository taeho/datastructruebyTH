package ch07.stack;

public class ArrayStack implements Stack {
	
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stachSize){
		top = -1;
		this.stackSize = stachSize;
		itemArray = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (top == this.stackSize - 1);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()){
			System.out.println("Interesting fail Array Stack is Full");
		} else {
			itemArray[++top] = item;
			System.out.println("Insert Item : " + item);
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail! Array Stack is empty!! ");
			return 0;
		} else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail! Array Stack is empty!! ");
			
		} else {
			top--;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting Fail! Array Stack is empty!! ");
			return 0;
		} else {
			return itemArray[top];
		}
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.println("Deleting Fail! Array Stack is empty!! ");
			
		} else {
			System.out.printf("Array Stack >>");
			for(int i =0 ; i<= top; i++){
				System.out.printf("%c", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
	}

}

package ch07.stack;

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

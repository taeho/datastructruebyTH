package ch07.stack.stack.link;

public class Test_Stack {
	public static void main(String[] args) {
        Stack stack = new Stack();
        Node popped;
         
        stack.push(new Node("abc"));
        stack.push(new Node("def"));
        stack.push(new Node("efg"));
        stack.push(new Node("hij"));
         
        int count = stack.getSize();
        System.out.printf("Size : %d,  Top : %s\n\n",
                count, stack.top.data);
         
        for(int i = 0; i < count; i++){
            if(stack.isEmpty())
                break;
             
            popped = stack.pop();
            System.out.printf("Popped : %s, ", popped.data);
             
            if(!stack.isEmpty())
                System.out.printf("Current Top : %s\n", stack.top.data);
            else
                System.out.println("Stack Is Empty.");
        }
    }

}

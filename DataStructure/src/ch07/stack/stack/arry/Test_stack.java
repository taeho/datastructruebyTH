package ch07.stack.stack.arry;

public class Test_stack {
	public static void main(String[] args) {
        
        // 스택 생성
        Stack stack = new Stack(5);
         
        // 데이터 추가
        stack.push(3);
        stack.push(37);
        stack.push(11);
        stack.push(12);
         
        if(stack.isFull())
            stack.push(20);
         
        // 정보 출력
        int size = stack.size();
        System.out.printf("Capacity : %d, Size : %d, Top : %d\n\n",
                stack.capacity(), size, stack.top());
         
        for(int i = 0; i <size; i++){
            if(stack.isEmpty())
                break;
             
            System.out.printf("Popped : %d, ", stack.pop());
             
            if(!stack.isEmpty())
                System.out.printf("Current Top : %d\n", stack.top());
            else
                System.out.println("Stack Is Empty.");
        }
         
    }

}

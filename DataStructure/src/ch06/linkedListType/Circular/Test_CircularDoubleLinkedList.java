package ch06.linkedListType.Circular;

public class Test_CircularDoubleLinkedList {

	 public static void main(String[] args) {
	        CircularDoubleLinkedList list = new CircularDoubleLinkedList();
	         
	        // 노드 5개 추가
	        for(int i = 0; i < 5; i++)
	            list.add(new Node(i));
	 
	        // 출력
	        System.out.print("[ ");
	        for(int i = 0; i < list.size(); i++)
	            System.out.print(list.get(i).data + " ");
	        System.out.println("]");
	         
	        System.out.println("\nDelete node from index : 2\n");
	        list.remove(2);
	 
	        // 출력
	        System.out.print("[ ");
	        for(int i = 0; i < list.size(); i++)
	            System.out.print(list.get(i).data + " ");
	        System.out.println("]");
	         
	        System.out.println("\nInsert node(100) to index : 2");
	        System.out.println("Insert node(200) to index : 2\n");
	        list.add(new Node(100), 2);
	        list.add(new Node(200), 2);
	 
	        // 출력
	        System.out.print("[ ");
	        for(int i = 0; i < list.size(); i++)
	            System.out.print(list.get(i).data + " ");
	        System.out.println("]");
	         
	        System.out.println("\nRemove node from index : 0\n");
	        list.remove(0);
	         
	        // 출력(2배)
	        System.out.print("[ ");
	        for(int i = 0; i < list.size() * 2; i++)
	            System.out.print(list.get(i).data + " ");
	        System.out.println("]");
	    }
}

package ch06.linkedListType.Double;

public class Test_DoubleLinkedList {
	public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
         
        // 노드 5개 추가
        for(int i = 0; i < 5; i++)
            list.add(new Node(i));
 
        list.print();
         
        System.out.println("\nDelete node from index : 2\n");
        list.remove(2);
        list.print();
 
        System.out.println("\nInsert node(100) to index : 2");
        System.out.println("Insert node(200) to index : 2\n");
        list.add(new Node(100), 2);
        list.add(new Node(200), 2);
        list.print();
         
        System.out.println("\nRemove node from index : 0\n");
        list.remove(0);
        list.print();
    }
}

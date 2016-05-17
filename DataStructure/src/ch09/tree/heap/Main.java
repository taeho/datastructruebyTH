package ch09.tree.heap;
/*
 * ch09. 힙 
 *  - 순차자료구조를 이용한 최대 힙 프로그램
 *  
 *  - 힙은 완전 이진 트리에 있는 노드 중에서 키 값이 가장 큰 노드 또는 키값이 가장 작은 노드를 찾기위해
 *  만든 자료구조. 최대 힙은 {부모노드의 키값 >= 자식노드의 키값}의 관계를 가지는 노드들의 완전 이진 트리고,
 *  최소 힙은 {부모노드의 키값 <= 자식노드의 키값}의 관계를 가지는 노드들의 완전 이진 트리이다.
 *  일반적으로 힙은 최대 힙을 의미하며, 값은 키값의 노드가 중복되어 있을 수 있다.
 * */
public class Main {
	public static void main(String[] args) {
		int n, item;
		Heap h = new Heap();
		
		h.insertHeap(13);
		h.insertHeap(8);
		h.insertHeap(10);
		h.insertHeap(15);
		h.insertHeap(20);
		h.insertHeap(19);
		
		h.printHeap();
		
		n= h.getHeapSize();
		
		for(int i=1; i<= n; i++){
			item = h.deleteHeap();
			System.out.printf("\n deleted Item : [%d]", item);
		}
		
	}
}

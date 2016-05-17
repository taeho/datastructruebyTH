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
public class Heap {
	private int heapSize;
	private int itemHeap[];
	
	public Heap(){
		heapSize = 0;
		itemHeap = new int[50];
	}
	
	public void insertHeap(int item){
		int i = ++heapSize;	// 현재 힙의 크기를 하나 증가시켜서 노드를 확장하고, 확장한 노드번호가 임시삽입위치(i)가 된다.
		while((i != 1 ) && (item > itemHeap[i/2])){	// 삽입할 원소 item과 부모노드(itemHeap[i/2])를 비교.
			itemHeap[i] = itemHeap[i/2];		// 만일 산입할 원소item 이 부모노드보다 크면, 부모노드와 자식노드의 자릴 바꿈(최대 힙의 관계를 만들기위해)
			i/=2;	// i/2를 임시위치 i로 해서 반복하면서 item을 삽입할 위치를 찾음
		}
		itemHeap[i] = item;	// 반복문을 통해 삽입할 원소 item을 저장하여 최대힙의 재구성.
	}
	
	public int getHeapSize(){
		return this.heapSize;
	}
	
	public int deleteHeap(){
		int parent, child;
		int item, temp;
		item = itemHeap[1];	// 루트 노드 heap[1]을 item에 저장.
		temp = itemHeap[heapSize--];	// 마지막노드의 원소를 temp로 임시저장
		parent = 1;	// 마지막 노드의 원소였던 temp의 임시 저장위치 i는 루트노드의 자리인 1번이됨
		child = 2;
		
		while(child <= heapSize) {
			if((child<heapSize) && (itemHeap[child] < itemHeap[child+1])) {
				child++;
			}
			
			if(temp >= itemHeap[child]) {
				break;
			}
			
			itemHeap[parent] = itemHeap[child];
			parent = child;
			child *= 2;
		}
		
		itemHeap[parent] = temp;
		return item;
	}
	
	public void printHeap(){
		System.out.printf("\nHeap >>> ");
		for(int i=1; i<=heapSize; i++){
			System.out.printf("[%d]" , itemHeap[i]);
		}
	}
	
}

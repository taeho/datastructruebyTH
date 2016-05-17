package ch09.tree.heap;
/*
 * ch09. �� 
 *  - �����ڷᱸ���� �̿��� �ִ� �� ���α׷�
 *  
 *  - ���� ���� ���� Ʈ���� �ִ� ��� �߿��� Ű ���� ���� ū ��� �Ǵ� Ű���� ���� ���� ��带 ã������
 *  ���� �ڷᱸ��. �ִ� ���� {�θ����� Ű�� >= �ڽĳ���� Ű��}�� ���踦 ������ ������ ���� ���� Ʈ����,
 *  �ּ� ���� {�θ����� Ű�� <= �ڽĳ���� Ű��}�� ���踦 ������ ������ ���� ���� Ʈ���̴�.
 *  �Ϲ������� ���� �ִ� ���� �ǹ��ϸ�, ���� Ű���� ��尡 �ߺ��Ǿ� ���� �� �ִ�.
 * */
public class Heap {
	private int heapSize;
	private int itemHeap[];
	
	public Heap(){
		heapSize = 0;
		itemHeap = new int[50];
	}
	
	public void insertHeap(int item){
		int i = ++heapSize;	// ���� ���� ũ�⸦ �ϳ� �������Ѽ� ��带 Ȯ���ϰ�, Ȯ���� ����ȣ�� �ӽû�����ġ(i)�� �ȴ�.
		while((i != 1 ) && (item > itemHeap[i/2])){	// ������ ���� item�� �θ���(itemHeap[i/2])�� ��.
			itemHeap[i] = itemHeap[i/2];		// ���� ������ ����item �� �θ��庸�� ũ��, �θ���� �ڽĳ���� �ڸ� �ٲ�(�ִ� ���� ���踦 ���������)
			i/=2;	// i/2�� �ӽ���ġ i�� �ؼ� �ݺ��ϸ鼭 item�� ������ ��ġ�� ã��
		}
		itemHeap[i] = item;	// �ݺ����� ���� ������ ���� item�� �����Ͽ� �ִ����� �籸��.
	}
	
	public int getHeapSize(){
		return this.heapSize;
	}
	
	public int deleteHeap(){
		int parent, child;
		int item, temp;
		item = itemHeap[1];	// ��Ʈ ��� heap[1]�� item�� ����.
		temp = itemHeap[heapSize--];	// ����������� ���Ҹ� temp�� �ӽ�����
		parent = 1;	// ������ ����� ���ҿ��� temp�� �ӽ� ������ġ i�� ��Ʈ����� �ڸ��� 1���̵�
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

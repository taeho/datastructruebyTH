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

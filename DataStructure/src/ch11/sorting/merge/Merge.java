package ch11.sorting.merge;

/*
 * http://blog.naver.com/inho860/130189431326
 * �⺻����: �迭�� �̵���Ͽ� �� ���� ������ �� �պ�
 * ���: �迭 a�� L�� R�� �̵���� �� �迭 L�� R�� ���� ����
 *      ���ĵ� �迭 L�� R���� ���� ���Ҹ� �����Ͽ� ���ο� �ӽ� ���� �迭 s�� ���ʴ�� ����
 *      ������ �迭 a �� ����
 * �ð����⵵: o(nlogn)
 * */

public class Merge {
	public static void mergeSort(int[] a){
		int[] temp = new int[a.length]; // �ӽù迭 ����
		internalMergeSort(a, temp, 0, a.length -1);
	}
	
	private static void internalMergeSort(int[] a, int[] temp, int m, int n){
		// a : �⺻ ���� �迭
		// temp : �ӽ� �迭 
		// m : �迭�� ó�� ��ġ index ��, ��, 0
		// n : �迭�� ������ ��ġ index ��, �� ���� -1 �� ��ġ���̵ȴ�.		
		
		// �迭�� ���� ������ ������ ����ȴ�.
		if(m < n) {
			// �ϴ� �� �迭�� �߰� index�� ã�´�.
			int middle = (m+n)/2;
			// ó����ġ ���� �߰� �ܰ��� index���� internal ��� ȣ��
			internalMergeSort(a, temp, m, middle);
			// �߰��ܰ� �ٷδ���(+1)���� �迭����ġ index���� interal ��� ȣ��
			internalMergeSort(a, temp, middle +1, n);
			// merge�� �����Ѵ�.
			merge(a, temp, m, middle, middle+1, n);
		}
	}
	
	private static void merge(int[] a, int[] temp, int m, int p, int q, int n){
		// a : �⺻ ���� �迭
		// temp : �ӽ� �迭
		// m : �迭�� ó�� ��ġ index ��
		// p : 
		// q :
		// n : 
		
		int t = m;
		int numElements = n-m+1;
		while( m <= p && q <= n){
			if(a[m] < a[q])
				temp[t++] = a[m++];
			else
				temp[t++] = a[q++];
		}
		
		while( m <= p )
			temp[t++] = a[m++];
		while( q <= n )
			temp[t++] = a[q++];
		for(int i =0; i<numElements; i++, n--)
			a[n] = temp[n];
	}
	
	public static void swap(int[] a, int j, int k){
		int temp = a[j];
		a[j] = a[k];
		a[k] = temp;
	}
	
	public static void main(String[] args){
		int[] a = {5, 2, 8, 3, 1};
		System.out.println("������ �迭 ���� : ");
		int i;
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " " );
		System.out.println();
		mergeSort(a);
		System.out.println("���ĵ� �迭 ���� : ");
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

}

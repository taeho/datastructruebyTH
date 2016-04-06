package ch11.sorting.merge;

/*
 * http://blog.naver.com/inho860/130189431326
 * 기본개념: 배열을 이등분하여 각 각을 정렬한 후 합병
 * 방법: 배열 a를 L과 R로 이등분한 후 배열 L과 R을 각각 정렬
 *      정렬된 배열 L과 R에서 작은 원소를 삭제하여 새로운 임시 공백 배열 s에 차례대로 삽입
 *      원래의 배열 a 에 복사
 * 시간복잡도: o(nlogn)
 * */

public class Merge {
	public static void mergeSort(int[] a){
		int[] temp = new int[a.length]; // 임시배열 선언
		internalMergeSort(a, temp, 0, a.length -1);
	}
	
	private static void internalMergeSort(int[] a, int[] temp, int m, int n){
		// a : 기본 적인 배열
		// temp : 임시 배열 
		// m : 배열의 처음 위치 index 값, 즉, 0
		// n : 배열의 마지막 위치 index 값, 즉 길이 -1 이 위치값이된다.		
		
		// 배열의 길이 내에서 조건이 적용된다.
		if(m < n) {
			// 일단 이 배열의 중간 index를 찾는다.
			int middle = (m+n)/2;
			// 처음위치 부터 중간 단계의 index까지 internal 재귀 호출
			internalMergeSort(a, temp, m, middle);
			// 중간단계 바로다음(+1)부터 배열끝위치 index까지 interal 재귀 호출
			internalMergeSort(a, temp, middle +1, n);
			// merge를 수행한다.
			merge(a, temp, m, middle, middle+1, n);
		}
	}
	
	private static void merge(int[] a, int[] temp, int m, int p, int q, int n){
		// a : 기본 적인 배열
		// temp : 임시 배열
		// m : 배열의 처음 위치 index 값
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
		System.out.println("정렬전 배열 원소 : ");
		int i;
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " " );
		System.out.println();
		mergeSort(a);
		System.out.println("정렬된 배열 원소 : ");
		for(i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

}

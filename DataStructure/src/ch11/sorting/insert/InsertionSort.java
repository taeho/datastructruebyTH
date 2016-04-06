package ch11.sorting.insert;

/*
 * http://bitnori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%82%BD%EC%9E%85%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * 정렬: 삽입 정렬 알고리즘.
 *     데이터를하나씩 적절한 위치에 삽입해가면서 젠처 데이터를 정렬하는 알고리즘
 * 
 * */

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {4, 9, 6, 8, 7, 2 , 1};
		int i, j, temp, in;
		// 1. 시작은 두번째 리스트 부터 하낟. 이유는 처번째 리스트는 하나이기 때문에 정렬되어있다고 가정
		for(i=1; i<index.length; i++){
			in = index[i];
			// 2. 두번째 리스트를 첫번째 리스트와 비교하여 적절한위치에 삽입한다.
			// 3. 세번째 리스트를 이전단계 까지 정렬되어 있는 리스트에서 들어갈 위치를 찾은 후 그곳에 삽입한다.
			// 4. 이와 같은 방법으로 네번째 리스트 이후 그 리스트가 끝날때 까지 계속해서 삽입한다.
			for(j=i-1; (j >=0) && (in <index[j]); j--){
				index[j+1] = index[j];
			}
			index[j+1] = in;
		}
		
		for(i=0 ; i < index.length; i++){
			System.out.print(index[i]+ " ");
		}
		
	}

}

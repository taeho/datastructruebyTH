package ch11.sorting.selection;

/*
 * http://bitnori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%84%A0%ED%83%9D%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * 정렬:선택정렬 알고리즘
 * 처음부터 끝까지 조사하면서 최소값 또는 최대값을 선택하여 정렬하는알고리즘
 * */

public class selectionSoriting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {5, 9 , 4, 7, 1, 8, 3, 2, 6 };
		int i, j, min;
		int temp = 0;
		
		for(i=0 ; i< index.length; i++){
			// 1. 주어진 리스트 중에 최소 값을 찾는다.
			// 2. 그값을 맨앞에 위치한 값과 교체한다.
			// 3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
			min = index[i];
			for(j=i; j<index.length - 1; j++){
				if(min > index[j+1]){
					min = index[j+1];
					temp = j+1;
				}
			}
			index[temp] = index[i];
			index[i] = min;
		}
		
		for(i=0 ; i<index.length; i++){
			System.out.print( index[i] + " " );
		}
	}

}

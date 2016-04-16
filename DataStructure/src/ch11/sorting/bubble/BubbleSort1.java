package ch11.sorting.bubble;

/*
 * http://bitnori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B2%84%EB%B8%94%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * 정렬 : 버블정렬
 * 내용 : 인접한 두 수를 비교해서 큰수 (작은수)를 뒤로 보내는 알고리즘 
 * */

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {8, 4, 7, 3, 1, 6, 5, 2 };
		int i, j, temp;
		
		for(i=0; i<index.length ; i++){
			for(j=1; j < index.length; j++){
				// 1. 인접한 두 인덱스를 비교해서 정렬이 되어 있지 않을 경우 정렬한다.
				// 2. 리스트 처음부터 끝까지 이런식의 정렬을 하고 나면 제일 마지막 리스트에서는
				//    제일 큰값(또는 작은 값)이 저장
				// 3. 다시 처음부터 리스트부터 마지막 리스트 이전 리스트까지 서로 이웃한 인덱스를 비교하며 정렬
				// 4. 이 방법으로 계속 정렬.
				if(index[j] < index[j-1]){
					temp = index[j];
					index[j] = index[j-1];
					index[j-1] = temp;
				}
			}
		}
		for(i=0 ; i< index.length; i++){
			System.out.printf(index[i]  +  " " );
		}
	}

}

package ch11.sorting.selection;

import java.util.Iterator;
 

/*
 * 선택정렬: 주어진 리스트중 가장 최소 값을 찾아 차례로 정리해가는 제자리 정렬 알고리즘 중 하나
 * 참고: http://ruzicka.blog.me/220509123707
 * 
 * */
public class selectionSoriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []test = {40, 3, 2, 1, 5, 99};
		selectSort(test);
		
	}
	
	static void selectSort(int[] intArr){
		System.out.println("start-----" + intArr.length);
		for(int k=0; k < intArr.length; k++){
			System.out.printf(" " + intArr[k]);
		}
		System.out.println();
		//System.out.println("\n------\n");
		int min, temp;
		for(int i=0; i< intArr.length-1; i++){
			// 만약 n부터 n-2까지 정렬되어 있다면 남은 하나는 이미 가장 큰 값을 갖기에
			// 해줄 필요가 없어서 -1까지만
			min = i; // 첫 번째 값
			//System.out.println("-min: "+min );
			for(int j = i+1; j < intArr.length; j++){ // 현재 배열 값의 다음 배열 값과 비교해야 하므로 i+1부터 
				System.out.println("> for > "+ intArr[j] + " === "+ intArr[min]);
				if(intArr[j] < intArr[min]){ // 비교
					min = j;				// 최소값이면 j를 min에 갱신
				}				
			}
			// 비교완료
			// 값의 위치 변경
			if(i != min) { //자기 자신일 경우 불필요한 자리바꿈을 막기위해 if문 추가
				temp = intArr[i];
				intArr[i] = intArr[min];
				intArr[min] = temp;
			}
		}
		
		for(int k=0; k < intArr.length; k++){
			System.out.printf(" " + intArr[k]);
		
		}
		System.out.println("\n------\n");
	}

}

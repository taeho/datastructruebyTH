package ch11.sorting.quick;


/*
 * 퀵정렬: 합병정렬과 비슷하게 전체 리스트 2개의 부분리스트로 분할하고, 각각의 부분리스트를
 *     다시 정렬하는 전형적인 분할 정복 방법을 사용한다.
 *     리스트에 있는 한 요소를 피벗으로(pivot)으로 선택한다.
 *     피벗보다 작은 쇼소들은 모두 피멋의 왼쪽으로 , 큰 요소들은 오른쪽으로 옮겨진다.
 *     
 *     결과적으로 피벗을 중심으로 왼쪽은 피벗보다 작은 요소들로 구성도고, 오른쪽은 피벗보다
 *     큰 요스들로 구성된다. 이 상태에서 피벗을 제외한 왼쪽리스트를 다시 정렬하게 되면 전체리스태
 * 참고: http://ruzicka.blog.me/220511860579
 * 
 * 
 * 
 * 
 * */

public class QuickSort {
	
	public static void main(String[] args) {
		int[] list = {26, 5, 37, 1, 61, 11, 59, 15, 48, 19};
		quickSort(list, 0, 9);
	}
	
	// 하나의 함수에 분활과 정렬을 모두 구현
	// 추자적인 메모리를 사용하지 않아도 된다.
	// high는 arr.length -1 값이 들어옴. arr의 인덱스 값이므로
	public static void quickSort(int[] arr, int row, int high){
		// 2 이하의 요소는 정렬 불필요 종료
		if(arr.length < 2){
			return;
		}
		
		for(int i=0 ; i< arr.length; i++){
			System.out.printf(" " + arr[i]);
		}
		
		int left = row;
		int right = high;
		int pivot = arr[(row+high)/2];
		
		System.out.println(" || pivot : " + pivot);
		// 분할
		do {
			while(arr[left] < pivot ) left++;	// 왼쪽 리스트에서 피벗보다 큰 레코드 선택
			while(arr[right] > pivot ) right--;	// 오른쪽 리스트에서 피벗보다 작은 레코드 선택
			if(left <= right ){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				// 인덱스의 범위를 줄인다.
				left++;
				right--;
			}
		} while (left <= right); // 인덱스 left, right 가 엇갈리지 않는 한 반복
		
		// 왼쪽 부터 분할 정복 시작
		if(row < right ) quickSort(arr, row, right); // 피벗의 위치 바로 앞까지 순환 호출한다.
		if(high > left) quickSort(arr, left, right); // 피벗의 위치 바로 뒤까지 순환 호출 한다.
		
	}

}

package ch11.sorting.quick;

import java.util.Random;

/*
 * http://118k.tistory.com/102
 * 알고리즘
 * 1. 리스트 가운데서 하나의 원소를 고른다. (이 원소를 피벗이라 한다.)
 * 2. 피벗 앞에는 피벗보다 작은 원소들이 오고, 피벗 뒤에는 큰 원소들이 오도록 피벗을 기준으로 리스트를 둘로 나눈다.
 * 이렇게 피벗의 위치가 정해진다.
 * 3. 피벗의 앞쪽 리스트와 피벗의 뒤쪽 리스트에 대하여 1, 2 를 반복한다.
 * 
 * */

public class QuickSort3 {
	
	public void sort(int[] array, int left, int right){
		if(left >= right){
			printArray(array);
			return;
		}
		int low = left + 1;	// low 는 left의 한칸 옆
		int high = right;	// high는 right와 동일함.
		int pivot = array[left];
		
		while(low <= high){
			while(low <= right && array[low] <= pivot){
				low++;
			}
			
			while(left+1 <= high && pivot <= array[high]){
				high--;
			}
			
			if(low <= high){
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			} else {
				array[left] = array[high];
				array[high] = pivot;
			}
		}
		
		sort(array, left, high -1);
		sort(array, high +1, right);
		
	}

	/*
	 * 배열 출력
	 * */
	private <E> void printArray(E[] array) {
		// TODO Auto-generated method stub
		for(E value : array){
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	/*
	 * 무작위 int 배열 생성
	 * */
	public int[] initArray(int capacity, int randomBound){
		int[] array = new int[capacity];
		Random random = new Random();
		for(int i=0; i< capacity; i++){
			array[i] = random.nextInt(randomBound);
		}
		
		return array;
	}
	
	public static void main(String[] args){
		int capacity = 10;
		int randomBound = 100;
		QuickSort3 quick = new QuickSort3();
		
		// 정렬대상 생성
		int[] array = quick.initArray(capacity, randomBound);
		quick.printArray(array);
		
		System.out.println("------start--------");
		quick.sort(array, 0, array.length-1);
	}

	private void printArray(int[] array) {
		for(int value : array){
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	

}

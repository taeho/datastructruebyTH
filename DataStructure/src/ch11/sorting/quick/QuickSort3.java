package ch11.sorting.quick;

import java.util.Random;

/*
 * http://118k.tistory.com/102
 * �˰���
 * 1. ����Ʈ ����� �ϳ��� ���Ҹ� ����. (�� ���Ҹ� �ǹ��̶� �Ѵ�.)
 * 2. �ǹ� �տ��� �ǹ����� ���� ���ҵ��� ����, �ǹ� �ڿ��� ū ���ҵ��� ������ �ǹ��� �������� ����Ʈ�� �ѷ� ������.
 * �̷��� �ǹ��� ��ġ�� ��������.
 * 3. �ǹ��� ���� ����Ʈ�� �ǹ��� ���� ����Ʈ�� ���Ͽ� 1, 2 �� �ݺ��Ѵ�.
 * 
 * */

public class QuickSort3 {
	
	public void sort(int[] array, int left, int right){
		if(left >= right){
			printArray(array);
			return;
		}
		int low = left + 1;	// low �� left�� ��ĭ ��
		int high = right;	// high�� right�� ������.
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
	 * �迭 ���
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
	 * ������ int �迭 ����
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
		
		// ���Ĵ�� ����
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

package ch11.sorting.quick;

/*
 * Âü°í: http://algolab.tistory.com/16
 * */

public class QuickSort2 {
	
	public static void swap(int[] list, int idx1, int idx2){
		int swapTmp = list[idx1];
		list[idx1] = list[idx2];
		list[idx2] = swapTmp;
	}
	
	
	public static int Partition(int[] list , int left, int right, int pivot_idx){
		int pivot = list[pivot_idx];
		swap(list, pivot_idx, right);	// move to end
		int split_idx = left;
		for(int i=left; i< right; i++){
			if(list[i] <= pivot){
				swap(list, split_idx, i);
				++split_idx;
			}
		}
		swap(list, right, split_idx); //move to to split index
		return split_idx;
	}
	
	public static void Sort(int[] list, int left, int right){
		if(right > left){
			//int pivot_idx = Partition(list, left, right, left);
			int pivot_idx = Partition(list, left, right, (left+right)/2);
			Sort(list, left, pivot_idx -1 );
			Sort(list, pivot_idx +1 , right);
		}
		
		
		for(int i=0; i < list.length; i++) {
			System.out.printf(" " + list[i]);	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {26, 5, 37, 1, 61, 11, 59, 15, 48, 19};
        Sort(list, 0, 9);
        

	}

}

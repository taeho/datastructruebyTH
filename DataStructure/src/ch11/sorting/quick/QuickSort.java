package ch11.sorting.quick;


/*
 * ������: �պ����İ� ����ϰ� ��ü ����Ʈ 2���� �κи���Ʈ�� �����ϰ�, ������ �κи���Ʈ��
 *     �ٽ� �����ϴ� �������� ���� ���� ����� ����Ѵ�.
 *     ����Ʈ�� �ִ� �� ��Ҹ� �ǹ�����(pivot)���� �����Ѵ�.
 *     �ǹ����� ���� ��ҵ��� ��� �Ǹ��� �������� , ū ��ҵ��� ���������� �Ű�����.
 *     
 *     ��������� �ǹ��� �߽����� ������ �ǹ����� ���� ��ҵ�� ��������, �������� �ǹ�����
 *     ū �佺��� �����ȴ�. �� ���¿��� �ǹ��� ������ ���ʸ���Ʈ�� �ٽ� �����ϰ� �Ǹ� ��ü������
 * ����: http://ruzicka.blog.me/220511860579
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
	
	// �ϳ��� �Լ��� ��Ȱ�� ������ ��� ����
	// �������� �޸𸮸� ������� �ʾƵ� �ȴ�.
	// high�� arr.length -1 ���� ����. arr�� �ε��� ���̹Ƿ�
	public static void quickSort(int[] arr, int row, int high){
		// 2 ������ ��Ҵ� ���� ���ʿ� ����
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
		// ����
		do {
			while(arr[left] < pivot ) left++;	// ���� ����Ʈ���� �ǹ����� ū ���ڵ� ����
			while(arr[right] > pivot ) right--;	// ������ ����Ʈ���� �ǹ����� ���� ���ڵ� ����
			if(left <= right ){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				// �ε����� ������ ���δ�.
				left++;
				right--;
			}
		} while (left <= right); // �ε��� left, right �� �������� �ʴ� �� �ݺ�
		
		// ���� ���� ���� ���� ����
		if(row < right ) quickSort(arr, row, right); // �ǹ��� ��ġ �ٷ� �ձ��� ��ȯ ȣ���Ѵ�.
		if(high > left) quickSort(arr, left, right); // �ǹ��� ��ġ �ٷ� �ڱ��� ��ȯ ȣ�� �Ѵ�.
		
	}

}

package ch11.sorting.selection;

import java.util.Iterator;
 

/*
 * ��������: �־��� ����Ʈ�� ���� �ּ� ���� ã�� ���ʷ� �����ذ��� ���ڸ� ���� �˰��� �� �ϳ�
 * ����: http://ruzicka.blog.me/220509123707
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
			// ���� n���� n-2���� ���ĵǾ� �ִٸ� ���� �ϳ��� �̹� ���� ū ���� ���⿡
			// ���� �ʿ䰡 ��� -1������
			min = i; // ù ��° ��
			//System.out.println("-min: "+min );
			for(int j = i+1; j < intArr.length; j++){ // ���� �迭 ���� ���� �迭 ���� ���ؾ� �ϹǷ� i+1���� 
				System.out.println("> for > "+ intArr[j] + " === "+ intArr[min]);
				if(intArr[j] < intArr[min]){ // ��
					min = j;				// �ּҰ��̸� j�� min�� ����
				}				
			}
			// �񱳿Ϸ�
			// ���� ��ġ ����
			if(i != min) { //�ڱ� �ڽ��� ��� ���ʿ��� �ڸ��ٲ��� �������� if�� �߰�
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

package ch11.sorting.bubble;

/*
 * http://bitnori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B2%84%EB%B8%94%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * ���� : ��������
 * ���� : ������ �� ���� ���ؼ� ū�� (������)�� �ڷ� ������ �˰��� 
 * */

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {8, 4, 7, 3, 1, 6, 5, 2 };
		int i, j, temp;
		
		for(i=0; i<index.length ; i++){
			for(j=1; j < index.length; j++){
				// 1. ������ �� �ε����� ���ؼ� ������ �Ǿ� ���� ���� ��� �����Ѵ�.
				// 2. ����Ʈ ó������ ������ �̷����� ������ �ϰ� ���� ���� ������ ����Ʈ������
				//    ���� ū��(�Ǵ� ���� ��)�� ����
				// 3. �ٽ� ó������ ����Ʈ���� ������ ����Ʈ ���� ����Ʈ���� ���� �̿��� �ε����� ���ϸ� ����
				// 4. �� ������� ��� ����.
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

package ch11.sorting.insert;

/*
 * http://bitnori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%82%BD%EC%9E%85%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * ����: ���� ���� �˰���.
 *     �����͸��ϳ��� ������ ��ġ�� �����ذ��鼭 ��ó �����͸� �����ϴ� �˰���
 * 
 * */

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {4, 9, 6, 8, 7, 2 , 1};
		int i, j, temp, in;
		// 1. ������ �ι�° ����Ʈ ���� �ϳ�. ������ ó��° ����Ʈ�� �ϳ��̱� ������ ���ĵǾ��ִٰ� ����
		for(i=1; i<index.length; i++){
			in = index[i];
			// 2. �ι�° ����Ʈ�� ù��° ����Ʈ�� ���Ͽ� ��������ġ�� �����Ѵ�.
			// 3. ����° ����Ʈ�� �����ܰ� ���� ���ĵǾ� �ִ� ����Ʈ���� �� ��ġ�� ã�� �� �װ��� �����Ѵ�.
			// 4. �̿� ���� ������� �׹�° ����Ʈ ���� �� ����Ʈ�� ������ ���� ����ؼ� �����Ѵ�.
			for(j=i-1; (j >=0) && (in <index[j]); j--){
				index[j+1] = index[j];
			}
			index[j+1] = in;
		}
		
		for(i=0 ; i < index.length; i++){
			System.out.print(index[i]+ " ");
		}
		
	}

}

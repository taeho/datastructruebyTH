package ch11.sorting.selection;

/*
 * http://bitnori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%84%A0%ED%83%9D%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 * ����:�������� �˰���
 * ó������ ������ �����ϸ鼭 �ּҰ� �Ǵ� �ִ밪�� �����Ͽ� �����ϴ¾˰���
 * */

public class selectionSoriting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {5, 9 , 4, 7, 1, 8, 3, 2, 6 };
		int i, j, min;
		int temp = 0;
		
		for(i=0 ; i< index.length; i++){
			// 1. �־��� ����Ʈ �߿� �ּ� ���� ã�´�.
			// 2. �װ��� �Ǿտ� ��ġ�� ���� ��ü�Ѵ�.
			// 3. �� ó�� ��ġ�� �� ������ ����Ʈ�� ���� ������� ��ü�Ѵ�.
			min = index[i];
			for(j=i; j<index.length - 1; j++){
				if(min > index[j+1]){
					min = index[j+1];
					temp = j+1;
				}
			}
			index[temp] = index[i];
			index[i] = min;
		}
		
		for(i=0 ; i<index.length; i++){
			System.out.print( index[i] + " " );
		}
	}

}

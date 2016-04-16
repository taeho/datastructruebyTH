package ch11.sorting.NumAsDs;


/*
 * http://bitnori.tistory.com/entry/Java-%EB%82%B4%EB%A6%BC%EC%B0%A8%EC%88%9C-%EC%A0%95%EB%A0%AC
 * 정렬: 내림차순 정렬 ( 숫자 )
 *     높은수에서 낮은수로  정렬하는 알고리즘
 * 
 * */

public class DescendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {5, 3, 2, 6, 10, 8, 1, 4, 9, 7 };
	    int i, j;
	    int temp = 0;
	    
	    for( i = 0; i<index.length; i++){
	    	for(j=0; j< index.length-1 ; j++){
	    		if(index[j] < index[j+1]){
	    			temp = index[j];
	    			index[j]= index[j+1];
	    			index[j+1] = temp;
	    		}
	    	}
	    }
	    for(i=0; i<index.length; i++){
	    	System.out.print(" " + index[i] );
	    }
	}

}

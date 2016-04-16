package ch11.sorting.NumAsDs;
/*
 * http://bitnori.tistory.com/entry/Java-%EC%98%A4%EB%A6%84%EC%B0%A8%EC%88%9C-%EC%A0%95%EB%A0%AC
 * 정렬: 오름차순 정렬 ( 숫자 )
 *     낮은수에서 높은 수로 정렬하는 알고리즘
 * 
 * */
public class AscendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {5, 3, 2, 6, 10, 8, 1, 4, 9, 7 };
	    int i, j;
	    int temp = 0;
	    
	    for( i = 0; i<index.length; i++){
	    	for(j=0; j< index.length-1 ; j++){
	    		if(index[j] > index[j+1]){
	    			temp = index[j+1];
	    			index[j+1]= index[j];
	    			index[j] = temp;
	    		}
	    	}
	    }
	    for(i=0; i<index.length; i++){
	    	System.out.print(index[i] + " " );
	    }
	}

}

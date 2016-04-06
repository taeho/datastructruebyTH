package ch11.sorting.bubble;

/*
 * http://blog.naver.com/pqw2002/220610092531
 * 
 * 버블정렬
 * 인데, 내림차순.
 * 
 * */
public class BubbleSort3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = {8, 4, 7, 3, 1, 6, 5, 2 };
		int i, j, temp;
		
		for(i=1; i<index.length-1 ; i++){
			for(j=0; j < index.length-i; j++){
				 
				if(index[j] < index[j+1]){
					temp = index[j];
					index[j] = index[j+1];
					index[j+1] = temp;
				}
			}
		}
		for(i=0 ; i< index.length; i++){
			System.out.printf(index[i]  +  " " );
		}
	}
}

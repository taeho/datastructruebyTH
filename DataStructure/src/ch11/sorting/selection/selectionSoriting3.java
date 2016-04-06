package ch11.sorting.selection;

public class selectionSoriting3 {
	public static void main(String[] args){
		int[] num = {88, 65, 74, 25, 62, 30, 12, 22};
		int t;
		
		System.out.printf("Source data : ");
		for(int n: num){
			System.out.printf("%4d", n);
		}
		
		// selection sort
		for(int i=0; i < num.length -1; i++){
			for(int j=i+1; j<num.length; j++){
				if(num[i] > num[j]){
					t= num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		
		System.out.println();
		System.out.printf("Sorted data : ");
		for(int n: num){
			System.out.printf("%4d", n);
		}
	}
}

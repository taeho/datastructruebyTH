package ch09.tree.case05;

/*
 * ch09. 이진 탐색 트리
 *  - 이진 탐색 트리의 연산 프로그램
 * 
 * */
public class Main {
	
	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
		bsT.insertBST('I');
		bsT.insertBST('H');
		bsT.insertBST('D');
		bsT.insertBST('B');
		bsT.insertBST('M');
		bsT.insertBST('N');
		bsT.insertBST('A');
		bsT.insertBST('J');
		bsT.insertBST('E');
		bsT.insertBST('Q');
		
		System.out.printf("\nBinary Tree>>> ");
		bsT.printBST();
		
		System.out.printf("Is There \"A\" ? >>> ");
		TreeNode p1 = bsT.searchBST('A');
		if(p1 != null ) {
			System.out.printf("Searching Success!! Searched Key: %c \n", p1.data);
		} else {
			System.out.printf("Searching Failed!! There is no : %c \n", p1.data);
		}
		
		System.out.printf("Is There \"Z\" ? >>> ");
		TreeNode p2 = bsT.searchBST('Z');
		if(p2 != null ) {
			System.out.printf("Searching Success!! Searched Key: %c \n", p2.data);
		} else {
			System.out.printf("Searching Failed!! \n");
		}
	}

}

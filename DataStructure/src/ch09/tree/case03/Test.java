package ch09.tree.case03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();

		bst.insertBST('G');
		bst.insertBST('I');
		bst.insertBST('H');
		bst.insertBST('D');
		bst.insertBST('B');
		bst.insertBST('M');
		bst.insertBST('N');
		bst.insertBST('A');
		bst.insertBST('J');
		bst.insertBST('E');
		bst.insertBST('Q');
		
		
		System.out.println("Binary Tree >>>");
        bst.printBST();
        
        System.out.println("Is There \"A\" ? >>> ");
        TreeNode p1 = bst.searchBST('A');
        if(p1!=null){
            System.out.println(p1.data + " Ž�� ����");
        }else{
            System.out.println("Ž�� ����");
        }
        
        System.out.println("Is There \"Z\" ? >>> ");
        TreeNode p2 = bst.searchBST('Z');
        if(p2!=null){
            System.out.println(p2.data + " Ž�� ����");
        }else{
            System.out.println("Ž�� ����");
        }
	}

}

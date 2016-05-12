package ch09.tree.case05;

/*
 * ch09. 이진 탐색 트리
 *  - 이진 탐색 트리의 연산 프로그램
 * 
 * */
public class BinarySearchTree {
	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		
		if(p==null) {
			return newNode;
		} else if(newNode.data < p.data) {
			p.left = insertKey(p.left, x);
			return p;
		} else if(newNode.data > p.data) {
			p.right = insertKey(p.right, x);
			return p;
		} else {
			return p;
		}
	}
	
	// value 삽입
	public void insertBST(char x) {
		root = insertKey(root, x);
	}
	
	// value 검색
	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while(p != null){
			if(x < p.data) p = p.left;
			else if(x > p.data) p = p.right;
			else return p;
		}
		return p;
	}
	
	// 중위순회
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf(" %c", root.data);
			inorder(root.right);
		}
	}
	
	// 출력
	public void printBST(){
		inorder(root);
		System.out.println();
	}
}

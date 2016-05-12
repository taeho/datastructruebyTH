package ch09.tree.case04;

/*
 * ch09. 이진트리
 * 이진트리의 순회 프로그램
 * 
 * */

public class LinkedTree {
	
	private TreeNode root;
	
	public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2){
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		
		return root;
	}
	
	// 전위 순회
	public void preorder(TreeNode root) {
		if(root != null){
			System.out.printf("%c", root.data);	// 현재 노드 방문
			preorder(root.left);				// 현재노드의 왼쪽 서브트리 이동
			preorder(root.right);				// 현재노드의 오른쪽 서브트리 이동
		}
	}
	
	// 중위 순회
	public void inorder(TreeNode root) {
		if(root != null){
			inorder(root.left);					// 현재노드의 왼쪽 서브트리 이동
			System.out.printf("%c", root.data);	// 현재 노드 방문
			inorder(root.right);				// 현재노드의 오른쪽 서브트리 이동
		}
	}
	
	// 후위 순회
	public void postorder(TreeNode root) {
		if(root != null){
			postorder(root.left);				// 현재노드의 왼쪽 서브트리 이동
			postorder(root.right);				// 현재노드의 오른쪽 서브트리 이동
			System.out.printf("%c", root.data);	// 현재 노드 방문
		}
	}

}

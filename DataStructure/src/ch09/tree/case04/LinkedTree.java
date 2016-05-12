package ch09.tree.case04;

/*
 * ch09. ����Ʈ��
 * ����Ʈ���� ��ȸ ���α׷�
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
	
	// ���� ��ȸ
	public void preorder(TreeNode root) {
		if(root != null){
			System.out.printf("%c", root.data);	// ���� ��� �湮
			preorder(root.left);				// �������� ���� ����Ʈ�� �̵�
			preorder(root.right);				// �������� ������ ����Ʈ�� �̵�
		}
	}
	
	// ���� ��ȸ
	public void inorder(TreeNode root) {
		if(root != null){
			inorder(root.left);					// �������� ���� ����Ʈ�� �̵�
			System.out.printf("%c", root.data);	// ���� ��� �湮
			inorder(root.right);				// �������� ������ ����Ʈ�� �̵�
		}
	}
	
	// ���� ��ȸ
	public void postorder(TreeNode root) {
		if(root != null){
			postorder(root.left);				// �������� ���� ����Ʈ�� �̵�
			postorder(root.right);				// �������� ������ ����Ʈ�� �̵�
			System.out.printf("%c", root.data);	// ���� ��� �湮
		}
	}

}

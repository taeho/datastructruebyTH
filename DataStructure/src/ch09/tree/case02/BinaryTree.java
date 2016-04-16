package ch09.tree.case02;

// ����Ʈ�� ��ȸ
public class BinaryTree {
	
	//���� ��ȸ (root, left, right)
	public static void preorderPrintTree(Node node){
		if(node == null){
			return;
		}
		
		// �θ� ��� ���
		System.out.print(" " + node.getData());
		
		// ���� ���� Ʈ�� ���
		preorderPrintTree(node.getLeft());
		
		// ������ ���� Ʈ�� ���
		preorderPrintTree(node.getRight());
	}
	
	// ���� ��ȸ (left, root, right)
	public static void inorderPrintTree(Node node){
		if(node == null){
			return;
		}
		
		// ���� ���� Ʈ�� ���
		inorderPrintTree(node.getLeft());
		
		// �θ��� ���
		System.out.print(" " + node.getData());
		
		// ������ ���� Ʈ�� ���
		inorderPrintTree(node.getRight());
	}
	
	// ���� ��ȸ  (left, right, root)
	public static void postorderPrintTree(Node node){
		if(node == null){
			return;
		}
		
		// ���� ���� Ʈ�� ���
		postorderPrintTree(node.getLeft());
		
		// ������ ����Ʈ�� ���
		postorderPrintTree(node.getRight());
		
		// �θ��� ���
		System.out.print(" " + node.getData());
		
	}

}

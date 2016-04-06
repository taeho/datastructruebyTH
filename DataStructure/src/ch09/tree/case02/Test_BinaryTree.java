package ch09.tree.case02;

public class Test_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 노드 생성
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
         
        // 트리에 노드 추가
        A.setLeft(B);
        B.setLeft(C);
        B.setRight(D);
        
        A.setRight(E);
        E.setLeft(F);
        E.setRight(G);
        
        // 출력
        // 전위 순회 (root, left, right)
        System.out.println("Preorder...");
        BinaryTree.preorderPrintTree(A);
        System.out.println("\n");
 
        // 중위 순회 (left, root, right)
        System.out.println("Inorder...");
        BinaryTree.inorderPrintTree(A);
        System.out.println("\n");
         
        // 후위순회 (left, right, root)
        System.out.println("Postorder...");
        BinaryTree.postorderPrintTree(A);
	}

}

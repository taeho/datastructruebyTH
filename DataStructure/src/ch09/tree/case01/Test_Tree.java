package ch09.tree.case01;

public class Test_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Ʈ ����
		Node root = new Node('A');
		
		// ��� ����
		Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        Node I = new Node('I');
        Node J = new Node('J');
        Node K = new Node('K');
 
        // ������ �߰�
        Tree.add(root, B);
        Tree.add(B, C);
        Tree.add(B, D);
        Tree.add(D, E);
        Tree.add(D, F);
         
        Tree.add(root, G);
        Tree.add(G, H);
         
        Tree.add(root, I);
        Tree.add(I, J);
        Tree.add(J, K);
         
        // ��� ���
        Tree.printTree(root, 0);
         
        // ������ ���
        for(int i = 0; i < 4; i++) {
            System.out.println("\nLevel : " + i);
            Tree.printLevel(root, i);
        }
		
	}

}

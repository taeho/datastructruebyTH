package ch10.graph.sample01;

/*
 * ch10. �׷��� : ����Ǿ� �ִ� ���Ұ��� ���踦 ǥ���ϴ� �ڷᱸ��
 *  
 *  - ������ �׷��� (Undirected Graph) : �� ������ �����ϴ� ������ ������ ���� �׷���.
 *  - ���� �׷���(Directed Graph) : ���̱׷���(digraph)����� ��. 
 *              ������ ������ �ִ� �׷���
 *    ���� �׷������� ����vi���� ����vj�� �����ϴ� ����, �� vi -> vj�� <vi, vj>�� ǥ���ϰ�,
 *    ȭ��ǥ�� ��Ÿ����. �׸��� vi�� ����(tail), vj�� �Ӹ�(head)��� �Ѵ�.
 *  - ���� �׷���(Complete Graph) : �� �������� �ٸ� ��� ������ ����Ǿ� �ִ��� ���� ���� ���� �׷���.
 *  - �κ� �׷���(Subgraph) : ������ �׷������� �Ϻ��� �����̳� ������ �����Ͽ� ���� �׷�����
 *     �κ� �׷���(subgraph)��� �Ѵ�.
 *  - ���� �׷���(Weight Graph) : ������ �����ϴ� ������ ����ġ(weight)�� �Ҵ��� �׷�����
 *       ���� �׷��� �Ǵ� ��Ʈ��ũ(network)��� �θ���.
 *  
 * */
public class Main {
	
	public static void main(String[] args) {
		AdjMatrix MG1 = new AdjMatrix();
		
		for(int i=0; i<4 ; i++ ) {
			MG1.insertVertex(i);
		}
		MG1.insertEdge(0, 3);
		MG1.insertEdge(0, 1);
		MG1.insertEdge(1, 3);
		MG1.insertEdge(1, 2);
		MG1.insertEdge(1, 0);
		MG1.insertEdge(2, 3);
		MG1.insertEdge(2, 1);
		MG1.insertEdge(3, 2);
		MG1.insertEdge(3, 1);
		MG1.insertEdge(3, 0);
		
		System.out.printf("\n�׷��� G1�� �������: ");
		MG1.printMatrix();
		System.out.println();
		
		AdjList LG1 = new AdjList();
		for(int i=0; i <4; i++) {
			LG1.insertVertex(i);
		}
		LG1.insertEdge(0, 3);
		LG1.insertEdge(0, 1);
		LG1.insertEdge(1, 3);
		LG1.insertEdge(1, 2);
		LG1.insertEdge(1, 0);
		LG1.insertEdge(2, 3);
		LG1.insertEdge(2, 1);
		LG1.insertEdge(3, 2);
		LG1.insertEdge(3, 1);
		LG1.insertEdge(3, 0);
		System.out.printf("\n�׷��� G1�� ��������Ʈ : ");
		LG1.printAdjList();
		System.out.println();
	}
	
}
package ch10.graph.sample01;

/*
 * ch10. 그래프 : 연결되어 있는 원소간의 관계를 표현하는 자료구조
 *  
 *  - 무방향 그래프 (Undirected Graph) : 두 정점을 연결하는 간선에 방향이 없는 그래프.
 *  - 방향 그래프(Directed Graph) : 다이그래프(digraph)라고도 함. 
 *              간선에 방향이 있는 그래프
 *    방향 그래프에서 정점vi에서 정점vj를 연결하는 간선, 즉 vi -> vj를 <vi, vj>로 표현하고,
 *    화살표로 나타낸다. 그리고 vi를 꼬리(tail), vj를 머리(head)라고 한다.
 *  - 완전 그래프(Complete Graph) : 한 정점에서 다른 모든 정점과 연결되어 최대의 간선 수를 가진 그래프.
 *  - 부분 그래프(Subgraph) : 원래의 그래프에서 일부의 정점이나 간선을 제외하여 만든 그래프를
 *     부분 그래프(subgraph)라고 한다.
 *  - 가중 그래프(Weight Graph) : 정점을 연결하는 간선에 가중치(weight)를 할당한 그래프를
 *       가중 그래프 또는 네트워크(network)라고 부른다.
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
		
		System.out.printf("\n그래프 G1의 인접행렬: ");
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
		System.out.printf("\n그래프 G1의 인접리스트 : ");
		LG1.printAdjList();
		System.out.println();
	}
	
}

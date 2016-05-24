package ch10.graph.sample01;

/*
 * ch10. 그래프 : 연결되어 있는 원소간의 관계를 표현하는 자료구조
 *  
 *  -  그래프의 인접 행렬 구현
 *  
 *  
 * */
public class AdjList {
	private GraphNode head[] = new GraphNode[10];
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	}
	
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다!");
		} else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}
	
	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		for(int i=0; i<totalV; i++) {
			System.out.printf("\n정점 %c의 인접리스트 " , i + 65);
			gNode = head[i];
			while(gNode != null){
				System.out.printf("-> %c", gNode.vertex + 65);
				gNode = gNode.link;
			}
		}
	}
}

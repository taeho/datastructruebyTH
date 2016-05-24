package ch10.graph.sample01;

/*
 * ch10. 그래프 : 연결되어 있는 원소간의 관계를 표현하는 자료구조
 *  
 *  -  그래프의 인접 행렬 구현
 *  
 *  
 * */
public class AdjMatrix {
	private int matrix[][] = new int[10][10];	// 그래프
	private int totalV = 0;
	
	// 그래프 matrix에 정점 v 삽입
	public void insertVertex(int v) {
		totalV++;
	}
	
	// 그래프 matrix에 간선 v1, v2를 삽입
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다!");
		} else {
			matrix[v1][v2] = 1;
		}
	}
	
	public void printMatrix(){
		for(int i=0; i<totalV; i++){
			System.out.printf("\n\t\t");
			for(int j=0; j<totalV; j++){
				System.out.printf("%2d", matrix[i][j]);
			}
		}
	}
}

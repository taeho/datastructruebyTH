package ch10.graph.sample01;

/*
 * ch10. �׷��� : ����Ǿ� �ִ� ���Ұ��� ���踦 ǥ���ϴ� �ڷᱸ��
 *  
 *  -  �׷����� ���� ��� ����
 *  
 *  
 * */
public class AdjMatrix {
	private int matrix[][] = new int[10][10];	// �׷���
	private int totalV = 0;
	
	// �׷��� matrix�� ���� v ����
	public void insertVertex(int v) {
		totalV++;
	}
	
	// �׷��� matrix�� ���� v1, v2�� ����
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("�׷����� ���� �����Դϴ�!");
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

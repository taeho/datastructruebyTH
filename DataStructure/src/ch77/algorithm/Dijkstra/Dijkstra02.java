package ch77.algorithm.Dijkstra;

import java.util.Vector;

/*
 * http://nsyang-textcube.blogspot.kr/2009/06/%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98dijkstra.html
 * */

public class Dijkstra02 {
	
	int n=0; // ������ ����
	
	final static int m = 30000; //���� ���°�...���� ū���� ����
	int data[][]; // ��ü ���� ������
	
	boolean visit[]; // �湮�� Ȯ��
	int dis[]; // ������������ �Ÿ�
	int prev[]; // ������ ���� ���� ����
	
	int s, e; // �������� ���� ����
	int stack[]; // ���������� ���������� ���� ����.
	
	Vector<Integer> stackV;
	
	// ���ͽ�Ʈ�� �˰��� / �������� ���� �ִܰŸ�
	public void init(int datal[][]){
		data = datal;
		n = data.length;
		System.out.println("data.lengt=" + data.length );
		dis = new int[n];	// ���������� ������ �Ÿ�
		visit = new boolean[n];
		prev = new int[n];
		stack = new int[n];
		stackV = new Vector<Integer>();
	}
	
	public int theLeastDistance(){
		return dis[e-1];		
	}
	
	public void start(int start, int end){
		System.out.println("======================");
		System.out.println("Dijkstra02 start");
		System.out.println("StartPoint " + start);
		System.out.println("endPoint " + end);
		System.out.println("======================");
		s = start;
		e = end;
		
		int k=0;
		int min=0;
		
		for(int i=0; i<n ; i++){
			dis[i] = m;
			prev[i] = 0;
			visit[i] = false;
		}
		dis[s-1] = 0; // �������� �Ÿ��� 0
		for(int i=0; i<n; i++){
			min = m;
			for(int j=0; j<n; j++){ // ������ ����ŭ �ݺ�
				if(visit[j] == false && dis[j] < min){ // Ȯ������ �ʰ� �Ÿ��� ª�� ������ ã��
					k=i;
					min = dis[i];
				}
			}
			visit[k] = true; // �ش� ���� Ȯ�� üũ
			if(min == m) break; // ����� ���� ������ ����
			
			// i -> j ����  i -> k -> j �� �Ÿ��� �� ������ ����
			for(int j=0; j<n; j++){
				if(dis[k] + data[k][j] < dis[j]) {
					dis[j] = dis[k] + data[k][j]; // �ִܰŸ� ����
					prev[j] = k; // j�� �������ؼ��� k�� ���ľ� ��.
				}
			}
		}
		nowLeastDistance(); // �ֿܼ��� �ִܰŸ� ���
		inverseFind();	// �ֿܼ��� �ִܰ�� ���
	}
	
	// �ִ� �Ÿ� ���
	public void nowLeastDistance(){
		System.out.printf("�ִܰŸ� : %10d    ",  dis[e-1]);
	}
	
	// �ִܰ�θ� ����
	
	public void inverseFind(){
		int tmp = 0;
		int top = -1;
		tmp = e-1;
		while(true){
			stack[++top] = tmp +1;
			if(tmp == s-1) break; // �������� �̸������� ����
			tmp = prev[tmp];
		}
		
		// ������ ��� ���
		stackV.removeAllElements();
		for(int i = top; i>-1; i--){
			//System.out.printf("%d", stack[i]);
			stackV.add(stack[i]);
		}
		//System.out.println();
		
	}
	
	public Vector<Integer> getStack(){
		return stackV;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 30000;
		int [][]data = new int[][]{
				{ 0, 2, m, m, m, 3, m, m },
				{ 2, 0, 4, 1, m, m, m, m },
				{ m, 4, 0, m, m, m, 3, m },
				{ m, 1, m, 0, 3, m, 2, m },
				{ m, m, 3, 3, 0, m, m, 4 },
				{ 3, m, m, m, m, 0, 6, m },
				{ m, m, m, 2, m, 6, 0, 4 },
				{ m, m, m, m, 4, m, 4, 0 } };
		
		Dijkstra02 k = new Dijkstra02();
		k.init(data);
		k.start(1, 3);		
	}

}


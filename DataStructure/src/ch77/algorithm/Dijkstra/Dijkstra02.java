package ch77.algorithm.Dijkstra;

import java.util.Vector;

/*
 * http://nsyang-textcube.blogspot.kr/2009/06/%EC%B5%9C%EB%8B%A8%EA%B1%B0%EB%A6%AC%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98dijkstra.html
 * */

public class Dijkstra02 {
	
	int n=0; // 정점의 갯수
	
	final static int m = 30000; //선이 없는곳...무지 큰수로 설정
	int data[][]; // 전체 지도 데이터
	
	boolean visit[]; // 방문지 확인
	int dis[]; // 시작점부터의 거리
	int prev[]; // 도착점 전의 정점 저장
	
	int s, e; // 시작점과 끝점 저장
	int stack[]; // 시작점부터 끝점까지의 순서 저장.
	
	Vector<Integer> stackV;
	
	// 다익스트라 알고리즘 / 달이점에 따라 최단거리
	public void init(int datal[][]){
		data = datal;
		n = data.length;
		System.out.println("data.lengt=" + data.length );
		dis = new int[n];	// 시작점으로 부터의 거리
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
		dis[s-1] = 0; // 시작점의 거리는 0
		for(int i=0; i<n; i++){
			min = m;
			for(int j=0; j<n; j++){ // 정점의 수만큼 반복
				if(visit[j] == false && dis[j] < min){ // 확인하지 않고 거리가 짧은 정점을 찾음
					k=i;
					min = dis[i];
				}
			}
			visit[k] = true; // 해당 정점 확인 체크
			if(min == m) break; // 연결된 곲이 없으면 종료
			
			// i -> j 보다  i -> k -> j 의 거리가 더 작으면 갱신
			for(int j=0; j<n; j++){
				if(dis[k] + data[k][j] < dis[j]) {
					dis[j] = dis[k] + data[k][j]; // 최단거리 저장
					prev[j] = k; // j로 가기위해서는 k를 거쳐야 함.
				}
			}
		}
		nowLeastDistance(); // 콘솔에서 최단거리 출력
		inverseFind();	// 콘솔에서 최단경로 출력
	}
	
	// 최단 거리 출력
	public void nowLeastDistance(){
		System.out.printf("최단거리 : %10d    ",  dis[e-1]);
	}
	
	// 최단경로를 저장
	
	public void inverseFind(){
		int tmp = 0;
		int top = -1;
		tmp = e-1;
		while(true){
			stack[++top] = tmp +1;
			if(tmp == s-1) break; // 시작점에 이르렀으면 종료
			tmp = prev[tmp];
		}
		
		// 역추적 결과 출력
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


package ch77.algorithm.Dijkstra;

public class ShortestPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = Integer.MAX_VALUE;
		int[][] matrix = new int[][] { 
			{ 0, 3, 1, m, m, 1 }, 
			{ m, 0, m, m, m, 3 }, 
			{ m, m, 0, m, m, m },
			{ m, m, m, 0, 2, m }, 
			{ m, m, m, m, 0, m }, 
			{ m, 1, m, 2, 6, 0 } };

		Dijkstra s = new Dijkstra();
		s.dijkstra(matrix, 0);
		
		System.out.println(s.getPathList(1));
		System.out.println(s.getPathList(2));
		System.out.println(s.getPathList(3));
		System.out.println(s.getPathList(4));
		System.out.println(s.getPathList(5));
		
//		[0, 5, 1]
//		[0, 2]
//		[0, 5, 3]
//		[0, 5, 3, 4]
//		[0, 5]

	}

}

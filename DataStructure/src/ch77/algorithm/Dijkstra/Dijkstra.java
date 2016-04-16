package ch77.algorithm.Dijkstra;

import java.util.ArrayList;
import java.util.Stack;

public class Dijkstra {
	boolean[] mVisit;
	long[] mDist;
	int[] mPath;
	int mStart;

	/**
	 * ��Ʈ�� �ִܰ��
	 * 
	 * @param st
	 * @param end
	 */
	void dijkstra(int[][] matrix, int st) {
		int size = matrix.length;

		boolean[] visit = new boolean[size];
		long[] dist = new long[size];
		int[] path = new int[size];

		double tmpDist = 0.0;
		int tmpIdx = 0;

		// Initialize
		for (int i = 0; i < size; i++) {
			dist[i] = Integer.MAX_VALUE;
			visit[i] = false;
			path[i] = -1;
		}

		// start point distance is 0.
		dist[st] = 0;

		for (int i = 0; i < size; i++) {
			tmpDist = Integer.MAX_VALUE;
			// ���� ª�� �� ����
			for (int j = 0; j < size; j++) {
				if (visit[j] == false && dist[j] < tmpDist) {
					tmpIdx = j;
					tmpDist = dist[j];
				}
			}

			// ������ �� �湮 üũ
			visit[tmpIdx] = true;

			// ª�� ���� ������ ����
			if (dist[tmpIdx] == Integer.MAX_VALUE) {
				break;
			} else {
				// ��
				for (int j = 0; j < size; j++) {
					if (dist[j] > dist[tmpIdx] + matrix[tmpIdx][j]) {
						dist[j] = dist[tmpIdx] + matrix[tmpIdx][j];
						path[j] = tmpIdx;
					}
				}
			}
		}

		mStart = st;
		mVisit = visit;
		mDist = dist;
		mPath = path;
	}

	/**
	 * �ִܰ�θ� ����Ʈ�� �����ؼ� ��ȯ
	 * 
	 * @return
	 */
	ArrayList<Integer> getPathList(int end) {
		ArrayList<Integer> resultList = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		int pointer = end;

		while (true) {
			if (mPath[pointer] != -1 && mStart != end) {
				stack.push(pointer);
				pointer = mPath[pointer];
			} else {
				stack.push(mStart);
				break;
			}
		}

		while (!stack.empty())
			resultList.add(stack.pop());

		return resultList;
	}
	
}

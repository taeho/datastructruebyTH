package ch08.queue.priority;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * 우선순위 큐 
 * http://asuraiv.blogspot.kr/2015/11/java-priorityqueue.html
 * */


public class Prisoner implements Comparable<Prisoner> {

	String name;
	int weight; // 형량
	
	public Prisoner(String name, int weight){
		super();
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Prisoner target){
		// 형량이 낮은 prisoner 객체를 먼저꺼내기 위해 오름차순으로 구현
		if(this.weight > target.weight){
			return 1;			
		} else if(this.weight < target.weight) {	
			return -1;
		}
		
		return 0;
	}
	
	// PriorityQueue 사용	
	private static PriorityQueue<Prisoner> getPriorityQueue() {
		Prisoner prisoner1 = new Prisoner("james", 5);
	    Prisoner prisoner2 = new Prisoner("schofield", 99);
	    Prisoner prisoner3 = new Prisoner("alex", 14);
	    Prisoner prisoner4 = new Prisoner("silvia", 10);
	    Prisoner prisoner5 = new Prisoner("thomson", 1);
	    
	    PriorityQueue<Prisoner> priorityQueue = new PriorityQueue<Prisoner>();

	    priorityQueue.offer(prisoner1);
	    priorityQueue.offer(prisoner2);
	    priorityQueue.offer(prisoner3);
	    priorityQueue.offer(prisoner4);
	    priorityQueue.offer(prisoner5);
		
		return priorityQueue;
	}
	
	public static void main(String[] args){
		// 형량이 낮은? 순서로 출력시 -> 주석풀면서 본다.
		PriorityQueue<Prisoner> priorityQueue = getPriorityQueue();
//		System.out.println("===============Normal Order");
//		while(!priorityQueue.isEmpty()){
//			Prisoner prisoner = priorityQueue.poll();
//			System.out.println(prisoner.name);
//		}
		
		// 형량이 높은? 순서로 출력시
		PriorityQueue<Prisoner> reversedPriorityQueue = new PriorityQueue<Prisoner>(priorityQueue.size(), Collections.reverseOrder());
		reversedPriorityQueue.addAll(priorityQueue);
		System.out.println("=============== Reversed Order!! ");
		while(!reversedPriorityQueue.isEmpty()){
			Prisoner prisoner = reversedPriorityQueue.poll(); // poll : 뽑는데 삭제하면서 뽑느다.
			System.out.println(prisoner.name);
		}
		
	}
}

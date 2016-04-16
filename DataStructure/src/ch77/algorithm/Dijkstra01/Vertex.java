package ch77.algorithm.Dijkstra01;

/*
 * http://stackoverflow.com/questions/17480022/java-find-shortest-path-between-2-points-in-a-distance-weighted-map
 * */

public class Vertex implements Comparable<Vertex> {

	public final String name;
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;
	public Vertex(String argName) {
		name = argName;
	}
	public String toString(){
		return name;
	}
	
	@Override
	public int compareTo(Vertex other) {
		// TODO Auto-generated method stub
		return Double.compare(minDistance, other.minDistance);
	}

}

package hazGraph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.time.Duration;
import java.time.Instant;

public class TestGraph {
	Set<String> theData;
	
	public TestGraph() {
		theData = new HashSet<>();
	}
	
	public void add(String str) {
		theData.add(str);
	}
	
	public boolean search(String str) {
		String temp = "";
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				temp += (""+ch);
			}
		}
		return theData.contains(temp);		
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(String st : this.theData) {
			result += (st + ", ");
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Graph g = new ListGraph(10, false);
		g.insert(new Edge(0, 1));
		g.insert(new Edge(0, 2));
		g.insert(new Edge(0, 6));
		g.insert(new Edge(0, 5));
		g.insert(new Edge(5, 3));
		g.insert(new Edge(5, 4));
		g.insert(new Edge(6, 4));
		g.insert(new Edge(3, 4));
		g.insert(new Edge(0, 7));
		g.insert(new Edge(5, 8));
		g.insert(new Edge(6, 9));
		g.insert(new Edge(9, 3));
		
		Instant start = Instant.now();
		BreadthFirstSearchAlgo bfs = new BreadthFirstSearchAlgo();
		int[] parents = bfs.breadFirstSearch(g, 0);
//		System.out.println(Arrays.toString(parents));
		Instant finish = Instant.now();
		
		long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println("FBS: " + timeElapsed+" millis");
		
		
		start = Instant.now();
		DepthFirstSearch dfs = new DepthFirstSearch(g);
		int[] discovered = dfs.depthFirstSearch(0);
//		System.out.println(Arrays.toString(discovered));
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println("DFS: " + timeElapsed +" millis");
	}

}

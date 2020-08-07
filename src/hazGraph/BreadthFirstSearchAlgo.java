package hazGraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author HamzaBoubacar
 * 
 *	Implementation of breadth first search algorithm (BFS) 
 */

public class BreadthFirstSearchAlgo {
	
	/** Perform a Breadth First Search of a graph.
	 * 	@post The array parent will contain the predecessor of each vertex 
	 * 		  in the breadth-first search tree.
	 * 	@param graph The graph to be searched
	 * 	@param start The start vertex
	 * 	@return The array of parents
	 */
	public int[] breadFirstSearch(Graph graph, int start) {
		Queue<Integer> theQueue = new LinkedList<>();
		
		// Declare array parent and initialize its elements to -1
		int[] parent = new int[graph.getNumbV()];
		for(int i = 0; i < parent.length; i++) {
			parent[i] = -1;
		}
		
		// Declare array identified and initialize its elements to false
		boolean[] identified = new boolean[graph.getNumbV()];
		
		// Mark the start vertex as identified and insert it in the queue
		identified[start] = true;
		theQueue.offer(start);
		
		
		// Perform breadth-first search until done
		while(!theQueue.isEmpty()) {
			/* Take a vertex, current, out of the queue. (begin visiting) */
			int current = theQueue.remove();
			
			/* Examine each vertex adjacent/neighbor to current */
			Iterator<Edge> iter = graph.edgeIterator(current);
			while(iter.hasNext()) {
				Edge edge = iter.next();
				int neighbor = edge.getDest();
				/* If neighbor has not been identified */
				if(!identified[neighbor]) {
					/* Mark it identified */
					identified[neighbor] = true;
					
					/* Place it into the queue */
					theQueue.offer(neighbor);
					
					/* Insert the edge (current, neighbor) into the tree */
					parent[neighbor] = current;
				}
			}
			// Finished visiting all vertices
		}
		
		return parent;
	}
	
	
	
	
	

}

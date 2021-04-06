package hazGraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author HamzaBoubacar
 *
 *
 * A ListGraph is an extension of the AbstractGraph class that uses an array or lists
 * to represent the edges
 */

public class ListGraph extends AbstractGraph {
	
	// Data Field
	/** An array of lists to contain the edges that originate with each index */
	private List<Edge>[] edges;
	
	
	// Constructor
	/** Constructs a graph with the specified number of vertices and directionality 
	 * 	@param numV The number of vertices
	 * @param directed The directionality flag
	 */
	public ListGraph(int numV, boolean directed) {
		super(numV, directed);
		this.edges = new List[numV];
		
		for(int i = 0; i < numV; i++) {
			this.edges[i] = new LinkedList<Edge>();
		}
	}
	
	
	// Accessor Methods
	/** Returns an iterator to the edges that originate from a given vertex
	 * @param source The source vertex
	 * @return an iterator to the edges that originate from vertex source
	 */
	public Iterator<Edge> edgeIterator(int source){
		return edges[source].iterator();
	}
	
	/** Gets the edge between two vertices
	 * @param source The source vertex
	 * @param dest The destination vertex
	 * @return The edge between these two vertices or null if an edge does not exist
	 */
	public Edge getEdge(int source, int dest) {
		Edge target = new Edge(source, dest, Double.POSITIVE_INFINITY);
		
		for(Edge edge : edges[source]) {
			if(edge.equals(target)) {
				return edge;		//Desired edge found, return it.
			}
		}
		
		return null;	//Assert: All edges for source checked; desired edge not found
	}
	
	/** Inserts a new edge into the graph
	 * @param edge The new edge
	 */
	public void insert(Edge edge) {
		edges[edge.getSource()].add(edge);
		
		if(!isDirected()) {
			edges[edge.getDest()].add(new Edge(edge.getDest(), edge.getSource(), edge.getWeight()));
		}
	}
	
	/** Determines whether an edge exist from vertex source to dest
	 * 	@param source The source vertex
	 * 	@param dest The destination vertex
	 * 	@return true if there is an edge from source to dest, false otherwise.
	 */
	public boolean isEdge(int source, int dest) {
		Edge e = new Edge(source, dest);	//build the edge source <---> dest
		return edges[source].contains(e);	//check if the edge exist at index source
	}


	@Override
	/*
	 * Returns the number of vertices in this graph
	 */
	public int getNumbV() {
		return super.getNumV();
	}
	
}

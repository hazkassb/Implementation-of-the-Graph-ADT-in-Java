package hazGraph;

import java.util.Iterator;

/**
 * @author HamzaBoubacar
 * 
 * Interface to specify a Graph ADT. A Graph is a set of vertices and a set of edges.
 * Vertices are represented by integers from 0 to n-1. Edges are ordered pairs of vertices.
 * Each implementation of the Graph interface should provide a constructor that specifies the
 * number of vertices and whether or not the Graph is direted. 
 */
public interface Graph {
	
	//Accessor Methods
	/** Return the number of vertices
	 * @return The number of vertices in the Graph
	 */
	int getNumbV();
	
	
	/** Determine whether this is a directed Graph
	 * @return true if this is a directed Graph; false, otherwise
	 */
	boolean isDirected();
	 
	
	/**Insert a new Edge into the Graph
	 * @param edge The new Edge
	 */
	void insert(Edge edge);
	
	
	/**Determine whether an Edge exists.
	 * @param source The source vertex
	 * @param dest The destination vertex
	 * @return true if there is an Edge from source to dest; false, otherwise
	 */
	boolean isEdge(int source, int dest);
	
	
	/**Get the Edge between two vertices
	 * @param source The source vertex
	 * @param dest The destination vertex
	 * @return The Edge between these two vertices or null if there is no edge
	 */
	Edge getEdge(int source, int dest);
	
	
	/**Return an iterator to the Edges connected to a given vertex
	 * @param source The source vertex
	 * @return An Iterator<Edge> to the vertices connected to source
	 */
	Iterator<Edge> edgeIterator(int source);
	
}

package hazGraph;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapGraph extends AbstractGraph {
	// Data Field
	/** An array of Maps to contain the edges that originate with each index */
	private Map<Integer, Edge>[] outgoingEdges;
	
		
	// Constructor
	/** Constructs an empty graph with the specified number of vertices and with the 
	 * specified directed flag. If directed is true, this is a directed flag.
	 * @param numV The number of vertices
	 * @param directed The directed flag
	 */
	public MapGraph(int numV, boolean isDirected) {
		super(numV, isDirected);
		outgoingEdges = new Map[numV];
		for(int i = 0; i < numV; i++) {
			outgoingEdges[i] = new LinkedHashMap<>();
		}
	}
	
	/** Inserts a new edge into the graph
	 * @param edge The new edge
	 */
	public void insertEdge(Edge edge) {
		int source = edge.getSource();
		int dest = edge.getDest();
		double weight = edge.getWeight();
		outgoingEdges[source].put(dest, edge);
		if (!isDirected()) {
			Edge reverseEdge = new Edge(dest, source, weight);
			outgoingEdges[dest].put(source, reverseEdge);
		}
	}

	/** Determines whether an edge exist from vertex source to dest
	 * 	@param source The source vertex
	 * 	@param dest The destination vertex
	 * 	@return true if there is an edge from source to dest, false otherwise.
	 */
	public boolean isEdge(int source, int dest) {
		return outgoingEdges[source].containsKey(dest);
	}
	
	/** Gets the edge between two vertices
	 * @param source The source vertex
	 * @param dest The destination vertex
	 * @return The edge between these two vertices or null if an edge does not exist
	 */
	public Edge getEdge(int source, int dest) {
		return outgoingEdges[source].get(dest);
	}

	/** Returns an iterator to the edges that originate from a given vertex
	* @param source The source vertex
	* @return an iterator to the edges that originate from vertex source
	*/
	public Iterator<Edge> edgeIterator(int source) {
		return outgoingEdges[source].values().iterator();
	}

	@Override
	public int getNumbV() {
		return super.getNumV();
	}

	@Override
	public void insert(Edge edge) {
		// TODO Auto-generated method stub
		
	}

	
}

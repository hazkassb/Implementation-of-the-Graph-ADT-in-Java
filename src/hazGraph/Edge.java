package hazGraph;

import java.util.Objects;

/**
 * 
 * @author HamzaBoubacar
 *
 */
public class Edge {
	
	//Data Fields
	/** The destination vertex of an edge */
	private int dest;
	
	/** The source vertex of edge */
	private int source;
	
	/** The weight */
	private double weight;
	
	
	//Constructors
	/** Constructs an edge from source to dest. Sets the weight to 1.0 */
	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
		this.weight = 1.0;
	}
	
	/** Constructs an edge from source to dest. Set the weight to w. */
	public Edge(int source, int dest, double w) {
		this.source = source;
		this.dest = dest;
		this.weight = w;
	}
	
	
	//Methods
	/** Compares to edges for equality. Edges are equal if their source and
	 * and destination vertices are the same. The weight is not considered.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Edge)) {
			return false;
		}
		Edge other = (Edge) obj;
		return dest == other.dest && source == other.source;
	}

	
	/** Returns the destination vertex
	 * 
	 */
	public int getDest() {
		return this.dest;
	}
	
	/** Returns the source vertex
	 * 
	 */
	public int getSource() {
		return this.source;
	}
	
	/** Returns the weight
	 * 
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/** Returns the hash code for an edge. The hash code depends only on the
	 *  source and destination.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dest, source);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Edge [source + " + " ==> " + dest + ": weight=" + weight + "]";
	}	
}

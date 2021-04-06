package hazGraph;

import java.util.Iterator;

//TODO
//QUITE INEFICIENT, CAN CONSUME A LOT OF SPACE IF THE GRAPH IS SPARSE!
public class MatrixGraph extends AbstractGraph {

	public MatrixGraph(int numV, boolean directed) {
		super(numV, directed);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int getNumbV() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(Edge edge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Edge getEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Edge> edgeIterator(int source) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}

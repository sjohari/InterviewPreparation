package Data_Structures.Graph;

public class Graph {

	int noOfVertices;
	int noOfEdges;
	
	int[][] adj;
	
	Graph(int v, int e){
		noOfVertices = v;
		noOfEdges = e;
		adj = new int[noOfVertices][noOfVertices];
	}

}

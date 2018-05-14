package Data_Structures.Graph;


public class findAllForestInAGraph {
	static int isVisited[];

	public static void main(String[] args) {
		Graph g = new Graph(5 , 4);
		g.adj[0][1] = 1;
		g.adj[0][2] = 1;
		g.adj[3][2] = 1;
		g.adj[2][3] = 1;
		g.adj[4][2] = 1;
		g.adj[2][4] = 1;
		isVisited = new int[5];
		int count =0;
		for(int i=0;i<5;i++){
			if(!(isVisited[i] > 0)){
				dfs(i , g);
				count++;
			}	
		}
		System.out.println(count + " ");

	}

	public static void dfs(int u  , Graph g) {
		isVisited[u] = 1;
		for(int i=0;i<5;i++){
			if(i!=u && isVisited[i] == 0 && g.adj[u][i]==1){
				dfs(i,g);
			}
		}

	}

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


// BFS Level oder  DFS Preorder

public class BFS {
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);

        g.printAdjList();
        System.out.println("\nBFS traversal starting from vertex 0:");
//        g.bfs(0);
        g.dfs(0);
    }

    static class Graph {

        ArrayList<ArrayList<Integer>>  adjlist = new ArrayList<>();

        Graph(int v) {

            for (int i = 0; i < v; i++) {
                adjlist.add(new ArrayList<>());
            }
        }

        public void addEdge(int u, int v) {
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }

        public void printAdjList() {
            for (int i = 0; i < adjlist.size(); i++) {
                System.out.print("Adj list of vertex " + i + ": ");
                for (int j = 0; j < adjlist.get(i).size(); j++) {
                    System.out.print(adjlist.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }

        public void bfs(int start) {
            int V = adjlist.size();
            boolean[] visited = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

            while (!q.isEmpty()) {
                int vertex = q.poll();
                System.out.print(vertex + " ");

                for (int adj : adjlist.get(vertex)) {
                    if (!visited[adj]) {
                        visited[adj] = true;
                        q.add(adj);
                    }
                }
            }
        }

        public void dfs (int start){

            int V = adjlist.size();
            boolean[] visited = new boolean[V];

            dfs2(start,visited);

        }
        public void dfs2(int start, boolean[] visited){

            visited[start]= true;
            System.out.print(start + " ");

            for(int i=0;i<adjlist.get(start).size();i++){

                int av = adjlist.get(start).get(i);

                if(!visited[av]){

                    dfs2(av,visited);
                }
            }
        }
    }


}

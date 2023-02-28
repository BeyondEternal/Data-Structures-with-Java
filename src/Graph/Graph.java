package Graph;


import java.util.LinkedList;

public class Graph {
    int vertex;
    LinkedList<Integer>[] dataStore;

     Graph(int vertex) {
        this.vertex = vertex;
        dataStore = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) dataStore[i] = new LinkedList<>();
    }

    void addEdge(int u, int vertex){
         dataStore[u].add(vertex);
    }

    void BFS(int s)
    {
        boolean[] visited=new boolean[vertex];
        LinkedList<Integer> q= new LinkedList<>();
        q.add(s);
        visited[s]=true;

        while(!q.isEmpty())
        {
            int x=q.poll();
            System.out.print(x+" ");

            for (int p : dataStore[x]) {
                if (!visited[p]) {
                    visited[p] = true;
                    q.add(p);
                }
            }
        }
    }


    void DFSUtil(int s, boolean[] visited)
    {
        visited[s]=true;
        System.out.println(s);

        for (int x : dataStore[s]) {
            if (!visited[x]) {
                //visited[x]=true;

                DFSUtil(x, visited);
            }
        }
    }


    void DFS(int s){
        boolean[] visited =new boolean[vertex];
        DFSUtil(s,visited);
    }
}

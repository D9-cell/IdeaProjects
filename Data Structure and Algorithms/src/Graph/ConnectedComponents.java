package Graph;

import Graph.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents  {

    /*******   This code cover all the disconnected or connected components in a Graph by BFS Approach   ******/

    public void breadthFirstSearch(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                bfsUtil(graph,visited);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        /** Source = 0**/
        queue.add(0);
        while (!queue.isEmpty()){
            int curr = queue.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                //Neighbor's of curr
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge edge = graph[curr].get(i);
                    queue.add(edge.destination);
                }
            }
        }
    }
    /***************************************************************************/

    /*******   This code cover all the disconnected or connected components in a Graph by DFS Approach   ******/
    public void depthFirstSearch(ArrayList<Edge>[] graph, int curr) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                depthFirstSearchUtil(graph,i,visited);
            }
        }
    }

    public static void depthFirstSearchUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        //Visit
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if(!visited[edge.destination]){
                depthFirstSearchUtil(graph, edge.destination, visited);
            }
        }
    }
}

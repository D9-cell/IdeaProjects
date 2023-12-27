package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {

    /*** Time Complexity = O(Vertex+Edge) ***/

    public void breadthFirstSearch(ArrayList<Edge>[] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

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

    /*** Time Complexity = O(Vertex+Edge) ***/
    public void depthFirstSearch(ArrayList<Edge>[] graph,int curr,boolean[] visited) {
        //Visit
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if(!visited[edge.destination]){
                depthFirstSearch(graph, edge.destination, visited);
            }
        }
    }
    public  boolean hasPath( ArrayList<Edge>[] graph,int source,int destination,boolean[] visited){
        if(source == destination){
            return true;
        }
        visited[source] = true;
        for (int i = 0; i < graph[source].size(); i++) {
            Edge edge = graph[source].get(i);
            /*** edge.destination = neighbour ***/
            if(!visited[edge.destination] && hasPath(graph, edge.destination, destination,visited)){
                return true;
            }
        }
        return false;
    }
    public  void neighborOfVertex(ArrayList<Edge>[] graph,int vertex){
        for (int i = 0; i < graph[vertex].size(); i++) {
            Edge edge = graph[vertex].get(i);
            System.out.print(edge.destination + " ");
        }
    }

    /************       Is graph doesn't have cycles then by default it's Bipartite Graph
     *                  Even Cycle --> TRUE ODD Cycle --> False                           **************/
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int[] color = new int[graph.length];
        /*** Arrays.fill(color, -1); This single line can replace the exact below for loop*/
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if(color[i] == -1){//Performing BFS
                queue.add(i);
                color[i] = 0;//Yellow
                while (!queue.isEmpty()){
                    int curr = queue.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge edge = graph[curr].get(j);
                        if(color[edge.destination] == -1){
                            int nextColor = color[curr]==0 ? 1 : 0 ;
                            color[edge.destination] = nextColor;
                            queue.add(edge.destination);
                        }else if(color[edge.destination] == color[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}

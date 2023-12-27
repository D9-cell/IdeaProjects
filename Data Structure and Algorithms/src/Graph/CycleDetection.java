package Graph;

import java.util.ArrayList;

public class CycleDetection {

    /***********************           Cycle Detection Code  for Undirected    ********************************/
    public boolean detectCycleUndirected(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(detectCycleUndirectedUtil(graph,visited,i,-1)){
                    return true;
                    //Cycle Exist in one of the part
                }
            }
        }
        return false;
    }
    private boolean detectCycleUndirectedUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            //Case 3
            if(!visited[edge.destination]){
                if(detectCycleUndirectedUtil(graph,visited, edge.destination, curr)){
                    return true;
                }

            }
            //Case 1
            else if(visited[edge.destination] && edge.destination != parent){
                return true;
            }
            //Case 2 --> do nothing --> continue
        }
        return false;
    }
    /**********************************************************************************************************/

    /***********************           Cycle Detection Code  for Directed    ********************************/
    public boolean isCycleDirected(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(isCycleDirectedUtil(graph,i,visited,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isCycleDirectedUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, boolean[] stack) {
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if(stack[edge.destination]){/*** cycle */
                return true;
            }
            else if(!visited[edge.destination] && isCycleDirectedUtil(graph,edge.destination,visited,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    /**********************************************************************************************************/
}

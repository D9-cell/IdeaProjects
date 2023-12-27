package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public void topologicalSort(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                topologicalSortUtil(graph,i,visited,stack);//Modified DFS
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    private void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if(!visited[edge.destination]){
                topologicalSortUtil(graph, edge.destination, visited, stack);
            }
        }
        stack.push(curr);
    }
}

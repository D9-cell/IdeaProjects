package Graph;

import java.util.ArrayList;

public class CreateGraph {

    private ArrayList<Edge>[] graph;

    public CreateGraph(ArrayList<Edge>[] graph) {
        this.graph = graph;
    }

    public ArrayList<Edge>[] graphOne(){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        /*** 0 Vertex ***/
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        /*** 1 Vertex ***/
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        /*** 2 Vertex ***/
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        /*** 3 Vertex ***/
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        /*** 4 Vertex ***/
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        /*** 5 Vertex ***/
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        /*** 4 Vertex ***/
        graph[6].add(new Edge(6,5,1));
        /*
         *                  (5)
         *         0 --------------- 1
         *                          / \
         *                     (1) /   \ (3)
         *                        /     \
         *                       2 ----- 3
         *                       |  (1)
         *                   (2) |
         *                       |
         *                       4
         *
         *
         * */
        return graph;
    }

    public ArrayList<Edge>[] graphForBipartite(){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        /** Vertex 0 **/
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        /** Vertex 1 **/
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        /** Vertex 2 **/
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        /** Vertex 3 **/
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        /** Vertex 4 **/
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));

/*
        0 ------------ 2
         \             |
          \            |
           1           |
          /            |
         /             |
        3--------------4
        Bipartite Result --> FALSE
 */     return graph;
    }

    public void createGraphForComponentCheck(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        /*** 0 Vertex ***/
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        /*** 1 Vertex ***/
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        /*** 2 Vertex ***/
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        /*** 3 Vertex ***/
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        /*** 4 Vertex ***/
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        /*** 5 Vertex ***/
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        /*** 4 Vertex ***/
        graph[6].add(new Edge(6,5,1));
    }

    public void createGraphForCycleDetectionUndirected(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        /*** 0 Vertex ***/
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        /*** 1 Vertex ***/
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        /*** 2 Vertex ***/
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        /*** 3 Vertex ***/
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));


        /*** 4 Vertex ***/
        graph[4].add(new Edge(4,3));

        /*
         *           0 ----------- 3
         *          /|             |
         *         / |             |
         *        1  |             |
         *         \ |             4
         *          \|
         *           2
         * */

    }

    public void createGraphForCycleDetectionDirected(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    public void createGraphForTopologicalSort(ArrayList<Edge>[] graph){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
}

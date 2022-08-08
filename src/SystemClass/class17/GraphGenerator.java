package SystemClass.class17;



/**
 * @author Kiteye
 * @date 7/8/2022
 * @Description 图的接口之一
 */

// matrix 所有的边
// N*3 的矩阵
// [weight,from节点上面的值,to节点上面的值]
public class GraphGenerator {
    public static Graph createGraph(int[][] matrix) {
        Graph graph = new Graph(); // 开始没有任何节点，空的
        for (int i = 0; i < matrix.length; i++) {
            int weight = matrix[i][0];
            int from = matrix[i][1];
            int to = matrix[i][2];
            if (!graph.nodes.containsKey(from)) {
                graph.nodes.put(from, new Graph_Node(from));
            }
            if (!graph.nodes.containsKey(to)) {
                graph.nodes.put(to, new Graph_Node(to));
            }
            Graph_Node fromNode = graph.nodes.get(from);
            Graph_Node toNode = graph.nodes.get(to);
            Graph_Edge newEdge = new Graph_Edge(weight, fromNode, toNode);
            fromNode.out_nexts.add(toNode);
            fromNode.out++;
            toNode.in++;
            fromNode.out_edges.add(newEdge);
            graph.edges.add(newEdge);
        }
        return graph;
    }
}

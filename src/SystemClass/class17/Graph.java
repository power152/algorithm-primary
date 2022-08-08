package SystemClass.class17;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Kiteye
 * @date 7/8/2022
 * @Description 图
 * 图有边集和点集组成
 */

public class Graph {
    public HashMap<Integer,Graph_Node> nodes; // 点集
    public HashSet<Graph_Edge> edges; // 边集

    public Graph() {
        nodes = new HashMap<>();
        edges = new HashSet<>();
    }
}

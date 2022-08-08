package SystemClass.class17;

import java.util.ArrayList;

/**
 * @author Kiteye
 * @date 7/8/2022
 * @Description 图的点
 */

// 点结构的描述
public class Graph_Node {
    public int value;
    public int in;  // 入度
    public int out; // 出度
    public ArrayList<Graph_Node> out_nexts; //点的邻居，表示出度的那边
    public ArrayList<Graph_Edge> out_edges; // 点的边，也是出度的三条边

    public Graph_Node(int value) {
        this.value = value;
        int in = 0;
        out = 0;
        out_nexts = new ArrayList<Graph_Node>();
        out_edges = new ArrayList<Graph_Edge>();
    }
}

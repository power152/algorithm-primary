package SystemClass.class17;




/**
 * @author Kiteye
 * @date 7/8/2022
 * @Description 图的边
 */

public class Graph_Edge {
    public int weight; //权重 （边的距离）
    public Graph_Node from;
    public Graph_Node to;

    public Graph_Edge(int weight,Graph_Node from,Graph_Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

}

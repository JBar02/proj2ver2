import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MST mst = new MST();
        KruskalsMST kruskalsMST = new KruskalsMST();

        int graph[][] = { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        boolean exit = false;

        while (!exit) {
            int choice = Menu.displayMenuAndGetChoice();
            switch (choice) {
                case 1:
                    mst.primMST(graph);
                    break;
                case 2:
                    kruskalsMST.kruskals(graph.length, getEdgeList(graph));
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Wybierz ponownie.");
            }
        }
    }

    private static List<KruskalsMST.Edge> getEdgeList(int[][] graph) {
        List<KruskalsMST.Edge> edges = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    edges.add(new KruskalsMST.Edge(i, j, graph[i][j]));
                }
            }
        }
        return edges;
    }
}

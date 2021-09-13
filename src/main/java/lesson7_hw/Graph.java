package lesson7_hw;

public interface Graph {

    void addVertex(char label);

    void addEdge(int start, int end, int weight);

    int getSize();

    void clean();

    void path();

}
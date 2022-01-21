package model;

public class Edge {

    private HexCell start;
    private HexCell end;

    public Edge(HexCell start, HexCell end) {
        this.start = start;
        this.end = end;
    }

    public HexCell getStart() {
        return start;
    }

    public HexCell getEnd() {
        return end;
    }

    public int getTravelCost() {
        return start.getExitCost() + end.getEnterCost();
    }

    public int getReverseTravelTime() {
        return start.getEnterCost() + end.getExitCost();
    }
}

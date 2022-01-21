package model;

import model.cellDecorator.ClassicCell;

import java.util.ArrayList;

/**
 * use the Axial Coordinates
 *
 */


public class HexCellGrid {

    private ArrayList<HexCell> cellList;
    private ArrayList<Edge> edgeList;

    public HexCellGrid(int w, int h){
        cellList = new ArrayList<HexCell>();
        edgeList = new ArrayList<Edge>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                this.cellList.add(new ClassicCell(j, i));
            }
        }

        for (HexCell cell:
             this.cellList) {
            if(cell instanceof ClassicCell){
                ArrayList<HexCell> listN = new ArrayList<HexCell>();
                listN.add(findCell(((ClassicCell) cell).getX() +1, ((ClassicCell) cell).getY()));
                listN.add(findCell(((ClassicCell) cell).getX() -1, ((ClassicCell) cell).getY()));
                listN.add(findCell(((ClassicCell) cell).getX(), ((ClassicCell) cell).getY() +1));
                listN.add(findCell(((ClassicCell) cell).getX(), ((ClassicCell) cell).getY() -1));
                listN.add(findCell(((ClassicCell) cell).getX() +1, ((ClassicCell) cell).getY() -1));
                listN.add(findCell(((ClassicCell) cell).getX() -1, ((ClassicCell) cell).getY() -1));

                for (HexCell cellN: listN)
                    if (cellN != null) this.edgeList.add(new Edge(cell, cellN));
            }
        }
    }


    public HexCell findCell(int x, int y){
        for (HexCell cell:
             this.cellList) {
            if (cell.equals(new ClassicCell(x, y)))
                return cell;
        }
        return null;
    }

    public ArrayList<HexCell> getNeighbors(HexCell cell){
        ArrayList<HexCell> listRes = new ArrayList<HexCell>();
        for (Edge edge:
             this.edgeList) {
            if(edge.getStart().equals(cell)) listRes.add(edge.getEnd());
        }
        return listRes;
    }
}

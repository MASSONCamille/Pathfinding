package model;

import model.cellDecorator.ClassicCell;

/**
 * use the Axial Coordinates
 *
 */


public class HexCellGrid {

    private HexCell axialCells[][];

    public HexCellGrid(int w, int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                this.axialCells[-1][0] = new ClassicCell();
            }

        }
    }

    public HexCell getCell(int x, int y){
        return axialCells[x][y];
    }
}

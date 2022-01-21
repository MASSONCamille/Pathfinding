package model.cellDecorator;

import model.HexCell;

public class ClassicCell extends HexCell {

    private int x, y;

    public static int defaultEnterCost = 2;
    public static int defaultExitCost = 2;
    public static int defaultViewRange = 5;
    public static boolean defaultWalkability = true;

    public ClassicCell(){
        super();
        this.x = 0;
        this.y = 0;
    }

    public ClassicCell(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getEnterCost() {
        return defaultEnterCost;
    }

    @Override
    public int getExitCost() {
        return defaultExitCost;
    }

    @Override
    public int getViewRange() {
        return defaultViewRange;
    }

    @Override
    public boolean IsWalkable() {
        return defaultWalkability;
    }
}

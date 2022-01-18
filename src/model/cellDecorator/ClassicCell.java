package model.cellDecorator;

import model.HexCell;

public class ClassicCell extends HexCell {

    public static int defaultEnterCost = 2;
    public static int defaultExitCost = 2;
    public static int defaultViewRange = 5;
    public static boolean defaultWalkability = true;

    public ClassicCell(){
        super();
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

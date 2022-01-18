package model.cellDecorator;

import model.HexCell;

public class CellForest extends DecoratorCell {

    public static int enterCostModifier = 0;
    public static int exitCostModifier = 0;
    public static int viewRangeModifier = 0;
    public static boolean Walkability = true;

    public CellForest(HexCell wrappee) {
        super(wrappee);
    }

    @Override
    public int getEnterCost() {
        return super.getEnterCost() + enterCostModifier;
    }

    @Override
    public int getExitCost() {
        return super.getExitCost() + exitCostModifier;
    }

    @Override
    public int getViewRange() {
        return super.getViewRange() + viewRangeModifier;
    }

    @Override
    public boolean IsWalkable() {
        return Walkability && super.IsWalkable();
    }
}

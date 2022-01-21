package model.cellDecorator;

import model.HexCell;

public class CellDeepHole extends DecoratorCell {

    public int getEnterCostModifier(){return 0;};
    public int getExitCostModifier(){return 0;};
    public int getViewRangeModifier(){return 0;};
    public boolean getWalkability(){return false;};

    public CellDeepHole(HexCell wrappee) {
        super(wrappee);
    }
}

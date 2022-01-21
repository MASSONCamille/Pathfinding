package model.cellDecorator;

import model.HexCell;

public class CellRoad extends DecoratorCell {

    public int getEnterCostModifier(){return 0;};
    public int getExitCostModifier(){return -1;};
    public int getViewRangeModifier(){return 0;};
    public boolean getWalkability(){return true;};

    public CellRoad(HexCell wrappee) {
        super(wrappee);
    }
}

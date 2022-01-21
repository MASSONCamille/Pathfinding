package model.cellDecorator;

import model.HexCell;

public class CellMountain extends DecoratorCell {

    public int getEnterCostModifier(){return 2;};
    public int getExitCostModifier(){return 0;};
    public int getViewRangeModifier(){return 2;};
    public boolean getWalkability(){return true;};

    public CellMountain(HexCell wrappee) {
        super(wrappee);
    }
}

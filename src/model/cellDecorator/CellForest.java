package model.cellDecorator;

import model.HexCell;

public class CellForest extends DecoratorCell {

    public int getEnterCostModifier(){return 0;};
    public int getExitCostModifier(){return 1;};
    public int getViewRangeModifier(){return -1;};
    public boolean getWalkability(){return true;};

    public CellForest(HexCell wrappee) {
        super(wrappee);
    }

}

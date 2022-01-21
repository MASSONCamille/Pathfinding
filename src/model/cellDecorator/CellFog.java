package model.cellDecorator;

import model.HexCell;

public class CellFog extends DecoratorCell {

    public int getEnterCostModifier(){return 0;};
    public int getExitCostModifier(){return 0;};
    public int getViewRangeModifier(){return -2;};
    public boolean getWalkability(){return true;};

    public CellFog(HexCell wrappee) {
        super(wrappee);
    }

}

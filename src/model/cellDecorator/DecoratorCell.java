package model.cellDecorator;

import model.HexCell;

public abstract class DecoratorCell extends HexCell {
    protected HexCell wrappee;

    public DecoratorCell(HexCell wrappee) {
        this.wrappee = wrappee;
    }

    public abstract int getEnterCostModifier();
    public abstract int getExitCostModifier();
    public abstract int getViewRangeModifier();
    public abstract boolean getWalkability();

    public HexCell getWrappee() {
        return wrappee;
    }

    @Override
    public int getX() {
        return wrappee.getX();
    }

    @Override
    public int getY() {
        return wrappee.getY();
    }

    @Override
    public int getEnterCost() {
        return this.wrappee.getEnterCost() + this.getEnterCostModifier();
    }

    @Override
    public int getExitCost() {
        return this.wrappee.getExitCost() + this.getExitCostModifier();
    }

    @Override
    public int getViewRange() {
        return this.wrappee.getViewRange() + this.getViewRangeModifier();
    }

    @Override
    public boolean IsWalkable() {
        return this.wrappee.IsWalkable() && this.getWalkability();
    }
}

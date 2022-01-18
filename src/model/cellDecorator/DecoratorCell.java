package model.cellDecorator;

import model.HexCell;

public abstract class DecoratorCell extends HexCell {
    protected HexCell wrappee;

    public DecoratorCell(HexCell wrappee) {
        this.wrappee = wrappee;
    }

    public HexCell getWrappee() {
        return wrappee;
    }

    @Override
    public int getEnterCost() {
        return this.wrappee.getEnterCost();
    }

    @Override
    public int getExitCost() {
        return this.wrappee.getExitCost();
    }

    @Override
    public int getViewRange() {
        return this.wrappee.getViewRange();
    }

    @Override
    public boolean IsWalkable() {
        return this.wrappee.IsWalkable();
    }
}

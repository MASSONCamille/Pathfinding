package model;


public abstract class HexCell {

    /**
     * @return X position
     */
    public abstract int getX();

    /**
     * @return Y position
     */
    public abstract int getY();

    /**
     * @return Enter cost for this cell
     */
    public abstract int getEnterCost();

    /**
     * @return Exit cost for this cell
     */
    public abstract int getExitCost();

    /**
     * @return Range max for the field of view
     */
    public abstract int getViewRange();

    /**
     * @return If cell can be crossed
     */
    public abstract boolean IsWalkable();

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) return true;

        HexCell cell = null;
        if(obj instanceof HexCell) cell = (HexCell) obj;
        else return false;

        if(this.getX() == cell.getX() && this.getY() == cell.getY()) return true;

        return false;
    }
}

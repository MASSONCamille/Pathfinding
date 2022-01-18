package model;


public abstract class HexCell {

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


}

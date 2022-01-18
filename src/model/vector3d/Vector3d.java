package model.vector3d;


// import javax.vecmath.Vector3d;

public class Vector3d {
    private static double defaultX = 0;
    private static double defaultY = 0;
    private static double defaultZ = 0;

    private double x, y,z;

    /**
     * generate with default values {0, 0, 0}
     */
    public Vector3d() {
        this.x = defaultX;
        this.y = defaultY;
        this.z = defaultZ;
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

package questions;

public final class Point3D implements Comparable<Point3D> {
    private final int x;
    private final int y;
    private final int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    @Override
    public int compareTo(Point3D other) {
        if (this.z != other.z) {
            return Integer.compare(this.z, other.z);
        }
        if (this.y != other.y) {
            return Integer.compare(this.y, other.y);
        }
        return Integer.compare(this.x, other.x);
    }
}
public class Point3D extends Point {
    public float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Point3D)
                && x == ((Point3D)o).x
                && y == ((Point3D)o).y
                && z == ((Point3D)o).z;
    }
}
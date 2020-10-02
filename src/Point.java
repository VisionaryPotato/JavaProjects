public class Point implements Comparable<Point> {
    public float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Point)
                && x == ((Point)o).x
                && y == ((Point)o).y;
    }

    @Override
    public int compareTo(Point p) {
        return Math.round(x - p.x);
    }
}
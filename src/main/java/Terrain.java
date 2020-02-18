public class Terrain {

    private int x;
    private int y;

    public Terrain(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(this.toString());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Terrain{ " +
                "x= " + x +
                ", y= " + y +
                '}';
    }
}

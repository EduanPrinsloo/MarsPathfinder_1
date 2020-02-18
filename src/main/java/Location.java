public class Location {

    private int x;
    private int y;
    private char direction;

    public Location(int x, int y, char direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }

    public void setLocation(int x, int y, char direction){
        this.setX(x);
        this.setY(y);
        this.setDirection(direction);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}

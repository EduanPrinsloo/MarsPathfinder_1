public class Rover {
    private Location location;
    private Terrain terrain;
    private String id;

    //Constructor
    public Rover(String id, Location location, Terrain terrain){
        this.id = id;
        this.location = location;
        this.terrain = terrain;
        System.out.println(this.toString());
    }

    //Getters and Setter

    public Terrain getTerrain() {
        return this.terrain;
    }

    public String getId() {
        return id;
    }
    public int getX() {return this.location.getX();};
    public int getY() {return this.location.getY();};
    public int getDirection() {return this.location.getDirection();};
    public void setX(int x) {this.location.setX(x);};
    public void setY(int y) {this.location.setY(y);};
    public void setDirection(char c) {this.location.setDirection(c);};

    @Override
    public String toString() {
        return "Placing " + id +
                " at coordinates " + location;
    }

    private void turnLeft() {
        if (this.getDirection() == 'N') {
            this.setDirection('W'); }

        else if (this.getDirection() == 'E') {
            this.setDirection('N'); }

        else if (this.getDirection() == 'S') {
            this.setDirection('E'); }

        else if (this.getDirection() == 'W') {
            this.setDirection('S'); }

        else { System.out.println("Vehicle out of bounds"); }
    }

    private void turnRight() {
        if (this.getDirection() == 'N') {
            this.setDirection('E');
        }
        else if (this.getDirection() == 'E') {
            this.setDirection('S');
        }
        else if (this.getDirection() == 'S') {
            this.setDirection('W');
        }
        else if (this.getDirection() == 'W') {
            this.setDirection('N');
        }
        else {
            System.out.println("Vehicle out of bounds");
        }
    }

    private void move() {
        if (getDirection() == 'N') {
            if (this.getY() < terrain.getY()) {
                this.setY(this.getY() + 1);
            } else {
                this.location.setLocation(-1, -1, 'Z');
            }
        } else if (this.getDirection() == 'E') {
            if (this.getX() < terrain.getX()) {
                this.setX(this.getX() + 1);
            } else {
                this.location.setLocation(-1, -1, 'Z');
            }
        } else if (this.getDirection() == 'S') {
            if (this.getY() > 0) {
                this.setY(this.getY() - 1);
            } else {
                this.location.setLocation(-1, -1, 'Z');
            }
        } else if (this.getDirection() == 'W') {
            if (this.getX() > 0) {
                this.setX(this.getX() - 1);
            } else {
                this.location.setLocation(-1, -1, 'Z');
            }
        } else {
            System.out.println("Vehicle out of bounds");
        }
    }

    public Location move(char[] C) {
        for (char c : C) {
            //System.out.println(c);
            if (c == 'L') {
                this.turnLeft();
            } else if (c == 'R') {
                this.turnRight();
            } else if (c == 'M') {
                this.move();
            }
        }

        System.out.println("Final location for "+this.id+": "+this.location);
        return this.location;
    }
}

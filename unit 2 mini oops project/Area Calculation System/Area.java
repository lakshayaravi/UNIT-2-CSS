abstract class Area {
    protected String name;

    public Area(String name) {
        this.name = name;
    }

    public abstract Float calculateArea();
}

class AreaOfCircle extends Area {
    private int radius;

    public AreaOfCircle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    
    public Float calculateArea() {
        if (radius < 0) return null;
        float pi = 3.14f;
        return pi * radius * radius;
    }
}

class AreaOfSquare extends Area {
    private int side;

    public AreaOfSquare(String name, int side) {
        super(name);
        this.side = side;
    }

    
    public Float calculateArea() {
        if (side < 0) return null;
        return (float) (side * side);
    }
}

class AreaOfRectangle extends Area {
    private int length, breadth;

    public AreaOfRectangle(String name, int length, int breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    
    public Float calculateArea() {
        if (length < 0 || breadth < 0) return null;
        return (float) (length * breadth);
    }
}
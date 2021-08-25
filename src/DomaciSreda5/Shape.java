package DomaciSreda5;

public abstract class Shape {
    private String name;


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract double circumference();

    public abstract double area();


    @Override
    public String toString() {
        return "Shape: " + name + "\n" + " Circumference: " + circumference() + "\n" + "Area: " + area() + "\n" + "...........";
    }
}


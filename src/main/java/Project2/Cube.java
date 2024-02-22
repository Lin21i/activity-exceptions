package Project2;

public class Cube extends ThreeDimensionalShape{
    private double width;

    public Cube(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6 * width * width;
    }

    @Override
    public double volume() {
        return width * width * width;
    }

    @Override
    public String toString() {
        return String.format("Cube {width=%.2f, surface area=%.2f, volume=%.2f}", width, surfaceArea(), volume());
    }
}

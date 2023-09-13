package CarpetCostCalculator;

public class Floor {
    // write your code here
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
    }

    public double getArea() {
        return width * length;
    }
}

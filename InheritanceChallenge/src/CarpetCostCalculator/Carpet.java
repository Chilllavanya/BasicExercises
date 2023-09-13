package CarpetCostCalculator;

public class Carpet {
    // write your code here
    private double cost;

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0) {
            cost = 0;
        }
    }

    public double getCost() {
        if (cost < 0) {
            cost = 0;
        }
        return cost;
    }
}

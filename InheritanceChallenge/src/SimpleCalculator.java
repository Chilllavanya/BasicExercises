public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        double add = calculator.getAdditionResult();
        double sub = calculator.getSubtractionResult();
        double mul = calculator.getMultiplicationResult();
        double div = calculator.getDivisionResult();
        System.out.println("Addition : " + add + "\nSubtraction : " + sub
                + "\nMultiplication : " + mul + "\nDivision : " + div);
    }
    public double getFirstNumber () {
        return firstNumber;
    }
    public double getSecondNumber () {
        return secondNumber;
    }
    public void setFirstNumber(double number){
        this.firstNumber = number;
    }
    public void setSecondNumber(double number){
        this.secondNumber = number;
    }
    public double getAdditionResult() {
        return firstNumber+secondNumber;
    }    public double getSubtractionResult() {
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber*secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) return 0;
        return firstNumber/secondNumber;
    }
}

abstract class Calculator 
{
    public abstract double calculate(double a, double b);
}

class Addition extends Calculator 
{
    public double calculate(double a, double b) 
    {
        return a + b;
    }
}

class Subtraction extends Calculator 
{
    public double calculate(double a, double b) 
    {
        return a - b;
    }
}

class Multiplication extends Calculator 
{
    public double calculate(double a, double b) 
    {
        return a * b;
    }
}

class Division extends Calculator
{
    public double calculate(double a, double b)
    {
        return a / b;
    }

}

public class CalculatorApp 
{
    public static void main(String[] args) 
    {
        Calculator additionCalculator = new Addition();
        System.out.println("Addition : " + additionCalculator.calculate(8, 2));

        Calculator subtractionCalculator = new Subtraction();
        System.out.println("Subtraction : " + subtractionCalculator.calculate(45, 7));

        Calculator multiplicationCalculator = new Multiplication();
        System.out.println("Multiplication : " + multiplicationCalculator.calculate(9, 5));

        Division divisionCalculator = new Division();
        System.out.println("Division : " +  divisionCalculator.calculate(4,2));

    }
}
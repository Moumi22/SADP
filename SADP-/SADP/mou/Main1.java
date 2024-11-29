abstract class Shape 
{
    public abstract double calculateArea();
    
}

class Circle extends Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return 3.14 * radius * radius;
    }

}

public class Main1
{
   public static void main(String[] args) 
   { 
     Circle circle = new Circle(5);
     System.out.println(circle.calculateArea());
   }

} 
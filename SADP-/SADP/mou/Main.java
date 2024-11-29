class Shape
{
  public double calculateArea( String shapeType, double param1, double param2)
  {
    double area =0.0;
        
    if(shapeType.equalsIgnoreCase("circle"))
    {
      double radius = param1;
      area  = 3.14 * radius * radius;

    }
    else if (shapeType.equalsIgnoreCase("rectangle"))
    {
      double weight = param1;
      double height = param2;
      area = weight*height;

    }
    return area;

  }
}

public class Main
{
  public static void main(String[] args)
  {
    Shape sh = new Shape();
    System.out.println(sh.calculateArea("rectangle", 3.0, 5.0));
  }
}

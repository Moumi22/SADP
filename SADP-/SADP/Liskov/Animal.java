interface Animal 
{
   public void eat();
   public  void trable();
}
class Tiger implements Animal
{
      public  void eat() 
      {
          System.out.println("Tiger eats");
      }

      public void travel() 
      {
          System.out.println("Tiger travels");
      } 
      public int noOfLegs() 
      {
          return 0;
      }

      public static void main(String args[]) 
      {
         Tiger  t = new Tiger();
         t.eat();
         t.travel();
      }
}

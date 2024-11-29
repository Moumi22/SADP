public class Person 
{
    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id)
    {
        this.name = name;
        this.age =age;
        this.id = id;

    }
    public void information()
    {
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("id " + id);

    }

    public static void main(String[]arg)
    {
        Person person = new Person( "tu",33, 002 );
        person.information();
    }
}
interface vehicle {
    void setPrice(double price);

}

interface Movable {
    void start();

    void stop();

}

interface Flyable {
    void fly();
}

class Car implements vehicle, Movable {
    double price;

    public void setPrice(double price) {
        this.price = price;
        System.out.println("price:" +price);
    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

}

public class VehicleBuilder {
    public static void main(String[]arg)
    {
        Car c = new Car();
        c.setPrice(77.99);
        c.start();
        c.stop();
    }


}
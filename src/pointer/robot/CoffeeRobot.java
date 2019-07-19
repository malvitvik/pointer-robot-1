package pointer.robot;

public class CoffeeRobot extends Robot {
    String model = "Coffee Robot";

    public CoffeeRobot() {}

    public CoffeeRobot(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("My model is" + model + ".");
        System.out.println("My supper class model is " + super.model + ".");

    }

    public void work() {
        System.out.println("I am a Coffee Robot. I cook coffee.");
    }

    public static void perform() {
        System.out.println("--> I am in a Coffee Robot class");
    }
}

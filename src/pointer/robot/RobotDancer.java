package pointer.robot;

public class RobotDancer extends Robot {
    String model = "Robot Dancer";

    public RobotDancer() {}

    public RobotDancer(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("My model is" + model + ".");
        System.out.println("My supper class model is " + super.model + ".");

    }

    public void work() {
        System.out.println("I am a Robot Dancer. I just dance.");
    }

    public static void perform() {
        System.out.println("--> I am in a Dancer Robot class");
    }
}

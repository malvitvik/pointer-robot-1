package pointer.robot;

public class RobotCooker extends Robot {
    String model = "Robot Cooker";

    public RobotCooker() {}

    public RobotCooker(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Robot Cooker run super.showModel():");
        super.showModel();
        System.out.println();

        System.out.println("My model is " + model + ".");
        System.out.println("My supper class model is " + super.model + ".");

    }

    public void work() {
        System.out.println("I am a Robot Cooker. I just cook.");
    }

    public static void perform() {
        System.out.println("--> I am in a Robot Cooker class");
    }
}

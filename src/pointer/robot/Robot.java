package pointer.robot;

public class Robot {
    String model = "Robot";

    public Robot() {}

    public Robot(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("My model is " + model + ". I am a supper class.");

    }

    public void work() {
        System.out.println("I am a Robot. I work.");
    }

    public static void perform() {
        System.out.println("--> I am in a Robot class");
    }
}

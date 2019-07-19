package pointer.robot;

public class Main {

    public static void main(String[] args) {
	    Robot robot0 = new Robot();
	    Robot robot1 = new CoffeeRobot();
	    Robot robot2 = new RobotDancer();
	    Robot robot3 = new RobotCooker();

	    showRobot(robot0);
	    showRobot(robot1);
	    showRobot(robot2);
	    showRobot(robot3);

	    CoffeeRobot robot4 = new CoffeeRobot();
        robot4.work();
        robot4.showModel();
        robot4.perform();
    }

    static void showRobot(Robot robot) {
        robot.work();
        robot.showModel();
        robot.perform();
        System.out.println();
    }
}

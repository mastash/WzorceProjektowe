package factory;

public class Main {

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();

        Robot dogRobot = robotFactory.makeRobot("DOG_ROBOT");
        Robot catRobot = robotFactory.makeRobot("CAT_ROBOT");

        dogRobot.work();
        catRobot.work();


    }
}


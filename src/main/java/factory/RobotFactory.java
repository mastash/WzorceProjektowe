package factory;

public class RobotFactory {
    public  Robot makeRobot(String robotType) {

        if (robotType == "DOG_ROBOT") {
            return new DogRobot();

        } else if (robotType == "CAT_ROBOT") {
            return new CatRobot();
        }
        return null;
    }
}

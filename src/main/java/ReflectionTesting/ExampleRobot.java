package ReflectionTesting;

public class ExampleRobot {
    ExampleRobot() {
        //Blank Constructor
        System.out.println("Blank constructor ran!");
    }
    public void translate(Enums.Direction dir, int counts, double speed) {
        System.out.println("First translate function! Direction: " + dir + " counts " + counts + " speed " + speed);
    }

    public void translate(String dir, int counts, double speed) {
        System.out.println("Second translate function! Direction: " + dir + " counts " + counts + " speed " + speed);
    }

    public void translate(String dir, Double counts, Double speed) {
        System.out.println("Third translate function! Direction: " + dir + " counts " + counts + " speed " + speed);
    }

    public void getGoldPosition() {
        System.out.println("GetGoldPosition ran with NO PARAMS!");
    }
}

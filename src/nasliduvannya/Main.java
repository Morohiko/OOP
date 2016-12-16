package nasliduvannya;

/**
 * Created by hp on 16.12.2016.
 */
class Main {
    public static void main(String[] args) {

        new TractorT25();
        new TractorT25(1967);
        new TankKV3();
        tankT150 tank = new tankT150();
        tank.name();
        tank.move();
        tank.motor();
        tank.pushka();
    }
}

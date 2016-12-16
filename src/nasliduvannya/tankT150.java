package nasliduvannya;

/**
 * Created by hp on 16.12.2016.
 */
class tankT150 implements Tank{
//    tankT150(){
//        name();
//        move();
//        motor();
//        pushka();
//    }

    @Override
    public void name() {
        System.out.println("Name: tankT150");
    }

    @Override
    public void move() {
        System.out.println("Speed: 30");
    }

    @Override
    public void motor() {
        System.out.println("Motor: B-5");
    }

    @Override
    public void pushka() {
        System.out.println("Pushka: F-34, 77mm");
    }
}

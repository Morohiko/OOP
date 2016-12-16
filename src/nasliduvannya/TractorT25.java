package nasliduvannya;

/**
 * Created by hp on 16.12.2016.
 */
class TractorT25 implements Tractor{
    TractorT25(){
        name();
        move();
        motor();
    }
    TractorT25(int year){
        name();
        move();
        motor();
        year(year);

    }
    @Override
    public void name() {
        System.out.println("name: tractorT25");
    }

    @Override
    public void move() {
        System.out.println("Move: 40");
    }

    @Override
    public void motor() {
        System.out.println("Motor: Д21А1");
    }

    void year(int i){
        System.out.println("year: " + i);
    }
}

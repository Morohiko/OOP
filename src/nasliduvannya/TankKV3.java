package nasliduvannya;

/**
 * Created by hp on 16.12.2016.
 */
class TankKV3 extends tankT150 {
    private String color = "green";
    TankKV3(){
        name();
        move();
        motor();
        pushka();
        color();
    }

    @Override
    public void name() {
        System.out.println("name: KV3");
    }

    @Override
    public void move() {
        System.out.println("move: 40");
    }

    @Override
    public void motor() {
        System.out.println("motor: В-2СН");
    }

    private void color(){
        System.out.println("color = " + color);
    }

}


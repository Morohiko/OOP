package polymorphism;

/**
 * Created by hp on 16.12.2016.
 */
class Snake implements Animal {
    Snake(){
        name();
        move();
        voise();
    }
    @Override
    public void name(){
        System.out.println("Snake:");
    }
    @Override
    public void move() {
        System.out.println("move: creep");
    }

    @Override
    public void voise() {
        System.out.println("voise: shshsh");
    }
}

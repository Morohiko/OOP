package polymorphism;

/**
 * Created by hp on 16.12.2016.
 */
class Dog implements Animal {
    Dog(){
        name();
        move();
        voise();
    }

    @Override
    public void name() {
        System.out.println("Dog:");
    }

    @Override
    public void move() {
        System.out.println("move: run");
    }

    @Override
    public void voise() {
        System.out.println("voise: gav");
    }

}

package polymorphism;

/**
 * Created by hp on 16.12.2016.
 */
class Snake implements Animal {
    private static int NSnake = 0;
    Snake(){
        name();
        N();
        move();
        voise();
    }
    @Override
    public void name(){
        //System.out.println("Snake:");
        Win.text = "Snake: ";
    }


    @Override
    public void N() {
        NSnake++;
        Win.text = Win.text + "N = " + NSnake + " " + '\n';
    }
    @Override
    public void move() {
//        System.out.println("move: creep");
        Win.text = Win.text + "move: creep" + '\n';
    }

    @Override
    public void voise() {
//        System.out.println("voise: shshsh");
        Win.text = Win.text + "voise: shshsh" + '\n';

    }
}

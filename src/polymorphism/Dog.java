package polymorphism;

/**
 * Created by hp on 16.12.2016.
 */
class Dog implements Animal {
    //static String text;
    private static int NDog = 0;
    Dog(){
        name();
        N();
        move();
        voise();

    }

    @Override
    public void name() {
        //System.out.println("Dog:");
        Win.text = "Dog: ";
    }

    @Override
    public void N() {
        NDog++;
        Win.text = Win.text + "N = " + NDog + " " + '\n';
    }


    @Override
    public void move() {
//        System.out.println("move: run");
        Win.text = Win.text + "move: run" + '\n';
    }

    @Override
    public void voise() {
//        System.out.println("voise: gav");
        Win.text = Win.text + "voise: gav" + '\n';
    }

}

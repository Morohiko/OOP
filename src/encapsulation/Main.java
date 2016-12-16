package encapsulation;

/**
 * Created by hp on 16.12.2016.
 */
class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setX(10);
        computer.setY(20);
        computer.sum();
        System.out.println(computer.getZ());
    }
}

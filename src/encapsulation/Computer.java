package encapsulation;

/**
 * Created by hp on 16.12.2016.
 */
class Computer {
    private int x = 0;
    private int y = 0;
    private int z = 0;

    void setX(int x){
        this.x = x;
    }

    void setY(int y){
        this.y = y;
    }

    int getZ(){
        return z;
    }

    void sum(){
        z = x + y;
    }








}

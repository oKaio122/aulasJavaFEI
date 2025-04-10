package Aula03Lab;

public class Swapper {
    private float x;
    private float y;

    public void swap(){
        float temp = this.x;
        this.x = y;
        this.y = temp;
    }

    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float newX){
        this.x = newX;
    }
    public void setY(float newY){
        this.y = newY;
    }
}

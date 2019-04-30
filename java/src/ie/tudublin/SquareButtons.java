package ie.tudublin;

import processing.core.PApplet;

public class SquareButtons extends UIElement{
 
    // private float x1;
    // private float x2; 
 
    // private float y1;
    // private float y2;
    private float length; 
    private int num;
 
    
  

    public SquareButtons(float x, float y, float length, int num, PApplet ui){
       
        super(x, y, ui);
        this.length= length;
        this.num = num;

       
    }


    public void render(){
        ui.fill(255);
        ui.textSize(10);
        ui.text(num,x+length/2,y - 10);
        ui.noFill();
        ui.stroke(0,153,204);
        ui.rect(x, y, length, length);
        ui.fill(ui.random(0,255),ui.random(0,255),ui.random(0,255));
        ui.rect(x+length/4,y+length/4,length/2,length/2);
        ui.fill(255);
        ui.textSize(10);
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }




















}
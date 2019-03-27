package ie.tudublin;

import processing.core.PApplet;

public class SquareButtons{
    private float x;
    // private float x1;
    // private float x2; 
    private float y;
    // private float y1;
    // private float y2;
    private float length; 
    private float size;
    PApplet ui; 

    public SquareButtons(float x, float y, float length, float size, PApplet ui){
        this.x = x;
        // this.x1 =x1;
        // this.x2 =x2;
        this.y =y;
        // this.y1 =y1;
        // this.y2 =y2;
        this.length= length;
        this.size = size; 
        this.ui = ui;
    }


    public void render(){
        ui.fill(0,0,0);
        ui.stroke(0,153,204);
        ui.rect(x, y, length, length);
        //ui.line(x1, y1, x2, y2);
    }




















}
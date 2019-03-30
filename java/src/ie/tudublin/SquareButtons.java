package ie.tudublin;

import processing.core.PApplet;

public class SquareButtons extends UIElement{
 
    // private float x1;
    // private float x2; 
 
    // private float y1;
    // private float y2;
    private float length; 
    
  

    public SquareButtons(float x, float y, float length, PApplet ui){
       
        super(x, y, ui);
        // this.x1 =x1;
        // this.x2 =x2;
       
        // this.y1 =y1;
        // this.y2 =y2;
        this.length= length;

       
    }


    public void render(){
        ui.noFill();
        ui.stroke(0,153,204);
        ui.rect(x, y, length, length);
        ui.fill(0,153,204);
        ui.rect(x+length/4,y+length/4,length/2,length/2);
        //ui.line(x1, y1, x2, y2);
    }




















}
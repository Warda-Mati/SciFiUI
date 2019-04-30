package ie.tudublin;

import processing.core.PApplet;

public class SquareBox extends UIElement {
    //private  int distance;
    private int size; 
     private int length;

    public SquareBox(float x, float y, int size, int length, PApplet ui)
    {
        super (x, y, ui);
        this.length=length;
        this.size=size;
    }

    public void render(){
        ui.noFill();
        ui.stroke(0,153,204);
        ui.rect(x + size/12, y + size/12, size, size);
      
       ui.line(x-10,y-10, x+10, y-10); // left top corner  horizontal line 
       ui.line(x-10, y-10, x-10, y+10); //left top corner   verticle line 
       ui.line(x-10, y+20, x-10, y+60); // left veticle line 

       ui.line(x-10, y+70, x-10, y+90); // left bottom corner verticle 
       ui.line(x-10, y+90, x+10, y+90); // left bottom corner horizontal 
       ui.line(x+20,y-10,x+60, y-10);  // top line 

       ui.line(x+70, y-10, x+90, y-10);  // right top corner  horizontal line 
       ui.line(x+90, y-10, x+90, y+10); // right top corner verticle line 
       ui.line(x+90, y+20, x+90, y+60);// right verticle line
       ui.line(x+20, y+90, x+60, y+90); // bottom line

       ui.line(x+90, y+70, x+90, y+90); // right bottom corner verticle 
       ui.line(x+90, y+90, x+70, y+90); // right bottom corner horizontal 
    

    

      
       

















    }
}
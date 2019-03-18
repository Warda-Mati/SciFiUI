package ie.tudublin;

import processing.core.PApplet;

public class RadarBorder{  // fields 
    private int x ;
    private int y; 
    private int length;  // width 
    private int size;  // height
    private String text; 
    PApplet ui;

    public RadarBorder(int x, int y, int length, int size, PApplet ui,String text) // constructor 
    {
        this.x = x; 
        this.y = y; 
        this.length = length; 
        this.size = size; 
        this.ui = ui;   
        this.text = text;
    }

    public void render()
    {
          
        ui.noStroke();
        ui.fill(255,100,50);
        ui.stroke(255,100,50);
        ui.line(x-20,y,x-20,y+200);
        ui.line((x+length)+20, y, (x+length)+20, y+200);
        ui.rect(x, y, length, size); // x, y, width, height
        ui.fill(255); 
        ui.ellipse(x,y,10,10);
        ui.fill(255);
        ui.textSize(10);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text,x+(length/2),y+(size/2));
    }
}




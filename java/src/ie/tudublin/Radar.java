package ie.tudublin;

import processing.core.PApplet;

public class Radar // class radar 
{
    private float x; // fields | circle | x, y, radius, diameter
    private float y;
    private float radius;
    private float diameter;
    PApplet ui; // papplet is a class , 

    public Radar(float x, float y, float diameter, PApplet ui) 
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter/2;
    }
    public void render()
    {
       ui.noFill();
       //ui.stroke(250,80,0);
       ui.stroke(255,255,102);
       ui.line(x,(y-radius),x,(y-radius) + 10);
       //ui.stroke(0,150,200);
       ui.stroke(102,153,255);
       ui.ellipse(x,y,diameter,diameter); 

    }
   
}
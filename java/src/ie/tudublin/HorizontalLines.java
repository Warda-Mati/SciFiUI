package ie.tudublin;

import processing.core.PApplet;

public class HorizontalLines extends UIElement
{

    private float distance;


public HorizontalLines(float x, float y, float distance, PApplet ui)
{
    super(x,y,ui);
    this.distance = distance;
    
}


public void render()

{
    ui.stroke(255,102,102);
    ui.strokeWeight(5);
    ui.line(x, y, x + distance, y);
    ui.strokeWeight(1);
}

    

}
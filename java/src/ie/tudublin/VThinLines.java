package ie.tudublin;

import processing.core.PApplet;

public class VThinLines extends UIElement 
{
    private float distance;

public VThinLines(float x, float y, float distance, PApplet ui)
{
    super(x, y, ui);
    this.distance = distance;

}

public void render(){
    
    ui.line(x, y, x , y + distance);

}
    



















} 
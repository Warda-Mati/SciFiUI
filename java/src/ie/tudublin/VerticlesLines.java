package ie.tudublin;

import processing.core.PApplet;

public class VerticlesLines extends UIElement 
{
    private float distance;



public VerticlesLines(float x, float y, float distance, PApplet ui)
{
    super(x, y, ui);
    this.distance = distance;

}

public void render(){
    ui.strokeWeight(5);
    ui.line(x, y, x , y + distance);
    ui.strokeWeight(1);
}
    



















} 
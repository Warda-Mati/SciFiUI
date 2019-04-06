package ie.tudublin;

import processing.core.PApplet;

public class SlideBar extends UIElement
{
    private float distance;
    private float length;
    
    public SlideBar(float x, float y, PApplet ui, float distance, float length)
    {
        super(x, y, ui);
        this.distance = distance;
        this.length = length;
    }

    public void render()
    {
        ui.fill(255,255,0);
        ui.line(x + length/2,y, x + length/2, y + distance);
        ui.fill(0,255,255);
        ui.rect(x,y,length,length/2);
        ui.fill(0,255,0);
        ui.line(x,y + length/4, x + length, y + length/4);

    }
}
package ie.tudublin;

import processing.core.PApplet;

public class HorizontalThinLine extends UIElement
{

    private float distance;


    public HorizontalThinLine(float x, float y, float distance, PApplet ui)
    {
        super(x,y,ui);
        this.distance = distance;
        
    }


    public void render()

    {
        
        ui.line(x, y, x + distance, y);
        
    }

    

}
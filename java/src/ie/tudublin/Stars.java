package ie.tudublin;

import processing.core.PApplet;

public class Stars extends UIElement
{
    private float size;
    public Stars(float x, float y, PApplet ui, float size)
    {
        super(x, y, ui);
        this.size = size;
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255,0,0);
        ui.rect(x,y,size,size);
        for(int i = 0; i < 10; i++)
        {
            ui.ellipse(ui.random(x,x+size),ui.random(y,y+size),20,20);
        }

    }
}
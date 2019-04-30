package ie.tudublin;

import processing.core.PApplet;

public class BGbutton extends UIElement implements BackGroundLight
{
    public float diameter;
    private float radius;
    public int color;

    public BGbutton(float x, float y, PApplet ui, float diameter, int color)
    {
        super(x,y,ui);
        this.diameter = diameter;
        this.radius = radius;
        this.color = color;
    }

    public void render()
    {
        ui.fill(ui.random(0,255),(ui.random(0,255)),(ui.random(0,255)));
        ui.ellipse(x,y,diameter,diameter);
        ui.noFill();
        ui.ellipse(x,y,diameter+20,diameter+20);
    }

    public void change(int color)
    {
        ui.colorMode(ui.HSB);
        ui.fill(color,255,255,80);
        ui.rect(0,0,ui.width,ui.height);
        ui.colorMode(ui.RGB);
    }
}
package ie.tudublin;

import processing.core.PApplet;

public class Lights extends UIElement
{
    private float distance;
    private float rotation;
    private boolean direction;
    public Lights(float x, float y, PApplet ui, float distance, boolean direction)
    {
        super(x,y,ui);
        this.distance = distance;
        this.rotation = 0;
        this.direction = direction;
    }
 
    public void render()
    {

        float gap = x;
        ui.pushMatrix();
        ui.translate(x,y);
        ui.rotate(rotation);
        for(int i = -50; i < 50; i++)
        {
            ui.line(0,0,gap+distance,ui.height + distance);
            gap++;
        }
        if(direction == false){
            rotation -= 0.05f;
        }
        else{
            rotation += 0.05f;
        }
        ui.popMatrix();
    }
}
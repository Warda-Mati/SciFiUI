package ie.tudublin;

import processing.core.PApplet;

public class ColourSquares extends UIElement
{
    private float size;


    public ColourSquares(float x, float y, float size, PApplet ui)
    {
        super(x, y, ui);
        this.size = size;
    }



    public void render()
    {
    
        ui.strokeWeight(2);
        ui.noStroke();
        for(int boxy=0; boxy< y + size; boxy=boxy+20)
        {
            for(int box=0; box< x + size; box=box+20)
            {
                float d = ui.dist(box,boxy,ui.mouseX, ui.mouseY);
                ui.fill(d/1.5f, ui.random(255), ui.random(255));
                ui.rect(x + box,y + boxy,20,20);
            }
        }
    }
}

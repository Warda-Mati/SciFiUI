package ie.tudublin;

import processing.core.PApplet;

public class ChordChart extends UIElement
{
    private float length;
    private float size;
    



    public ChordChart(float x, float y, float length, float size,PApplet ui)
    {
        super(x, y, ui);
        this.length = length;
        this.size = size;

    }


    public void render(){

        ui.stroke(255, 89, 60);
        ui.noFill();
        ui.rect(x, y, length, size);
        int gap = 17;
        float numbars = (int)length/x + gap; 
        float currwidth = 0;
        for(int i =0; i < numbars; i++)
        {
            float barheight = (ui.random(y, y+size));
            for(float currheight = y + size; currheight >= barheight; currheight = currheight - gap+3)
            {
                currwidth = x + (i*gap);
                ui.noStroke();
                float color = ui.map(currheight,barheight,y+size,0,255);
                ui.fill(color - 30, color - 45, color);
                ui.rect(currwidth, currheight - 10, 15, 10);
                ui.textSize(10);
                ui.text(currheight,x+length/2,y+size/2);
            }
        }
    }

}
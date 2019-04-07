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
        int gap = 18;
        float numbars = (int)length/x + gap;
        float currwidth = 0;
        for(int i =0; i < numbars; i++)
        {
            float barheight = (ui.random(y+size/2, y+size + 50));
            for(float currheight = y + size; currheight >= barheight; currheight = currheight - gap)
            {
                currwidth = x + (i*gap);
                ui.fill(ui.random(0,255),ui.random(0,255),ui.random(0,255));
                ui.rect(currwidth, currheight - 10, 15, 10);
                ui.textSize(10);
                ui.text(currheight,x+length/2,y+size/2);
            }
        }


        // for(float currheight = y + size; currheight >= barheight; currheight = currheight - gap)
        // {
        //     ui.fill(255);
        //    // ui.rect(x,y ,20, currheight);
        //     ui.rect(x,currheight ,20, y);
        //     ui.textSize(10);
        //     ui.text(currheight,x+length/2,y+size/2);
        // }
       





    }

}
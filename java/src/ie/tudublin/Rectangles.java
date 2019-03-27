package ie.tudublin;

import processing.core.PApplet;

public class Rectangles extends UIElement{
   
    private int size;
    private int length; 
    int hue;
   

    public Rectangles(int x, int y, int size, int length, PApplet ui, int hue)
    {
        super(x, y, ui);
        this. size = size; 
        this. length = length; 
        this.ui = ui;  
       this. hue = hue;
    }


    public void render (boolean fill)
    {
        if(fill = true)
        {
            ui.fill(hue,255,255);
        }
        else
        {
            ui.noFill();
            ui.stroke(hue,255,255);
        }
       
       ui.rect(x, y, size, length);
    }

























}


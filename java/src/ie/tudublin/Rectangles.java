package ie.tudublin;

import processing.core.PApplet;

public class Rectangles{
    private int x; 
    private int y; 
    private int size;
    private int length; 
    int hue;
    PApplet  ui; 

    public Rectangles(int x, int y, int size, int length, PApplet ui, int hue)
    {
        this. x = x;
        this. y = y;
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


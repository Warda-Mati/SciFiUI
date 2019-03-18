package ie.tudublin;

import processing.core.PApplet;

public class Rectangles{
    private int x; 
    private int y; 
    private int size;
    private int length; 
    PApplet  ui; 

    public Rectangles(int x, int y, int size, int length, PApplet ui)
    {
        this. x = x;
        this. y = y;
        this. size = size; 
        this. length = length; 
        this.ui = ui;  
    }


    public void render ()
    {
       
       ui.rect(x, y, size, length);
    }

























}


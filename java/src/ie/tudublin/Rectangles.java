package ie.tudublin;

import processing.core.PApplet;

public class Rectangles extends UIElement{
   
    private int size;
    private int length; 
    int hue;
    float red;
    float green;
    float blue;
   

    public Rectangles(int x, int y, int size, int length, PApplet ui,float red,float green,float blue)
    {
        super(x, y, ui);
        this. size = size; 
        this. length = length; 
        this.ui = ui;  
       this.red = red;
       this.green = green;
       this.blue = blue;
       
    }


    public void render () 
    {
        ui.fill(red, green, blue,200);
        ui.stroke(200,0,150);
        ui.rect(x, y, size, length);
        ui.fill(ui.random(0,255),ui.random(0,255),ui.random(0,255));
        for(int i =0; i < 4; i++)
        {
            ui.noStroke();
            ui.ellipse(ui.random(x , x + size), y + length/2 , length, length);
        }
    } 


}


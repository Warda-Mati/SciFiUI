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
       // this.hue = hue;
       this.red = red;
       this.green = green;
       this.blue = blue;
       
    }


    public void render () // it was boolean fill 
    {
    //     if(fill = true)
    //     {
    //         ui.fill(red,green,blue);
    //     }
    //     else
    //     {
    //         ui.noFill();
    //         ui.stroke(red,green,blue);
    //     }
       
        ui.fill(red, green, blue);
        ui.rect(x, y, size, length);
    }

}


package ie.tudublin;
import processing.core.PApplet;

public class Boxes extends UIElement{
   
    private int size;
    private int length; 
    int hue;
    float red;
    float green;
    float blue;
   

    public Boxes(int x, int y, int size, int length, PApplet ui,float red,float green,float blue)
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
  
        ui.fill(red, green, blue);
        ui.stroke(200,0,150);
        ui.rect(x, y, size, length);
        
    } 
}
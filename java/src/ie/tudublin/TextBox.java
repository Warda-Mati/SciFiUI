package ie.tudublin;

import processing.core.PApplet;

public class TextBox extends UIElement
{
    private int length; 
    private int size;
    private String text;


    public TextBox (float x, float y, int length, int size, String text,PApplet ui)
    {
        super(x, y, ui);
        this.length = length;
        this.size = size;
        this.text = text;
    }



    public void render(){
        ui.noStroke();
        ui.fill(255,100,50);
        ui.stroke(255,100,50);
        ui.rect(x, y, size, length);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text,x+(size/2),y+(length/2));
    }

}
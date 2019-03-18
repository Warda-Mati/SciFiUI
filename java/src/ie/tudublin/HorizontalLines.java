package ie.tudublin;

import processing.core.PApplet;

public class HorizontalLines{
    private float x1;
    private float y1;
    private float x2;
    private float y2; 
    PApplet ui;
    


public HorizontalLines(float x1, float y1, float x2, float y2, PApplet ui)
{
    this.x1 =x1;
    this.y1 = y1;
    this.x2 =x2;
    this.y2 =y2;
    this.ui = ui;
}


public void render()
{
    ui.line(x1, y1, x2, y2);
}













}
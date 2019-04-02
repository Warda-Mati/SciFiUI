package ie.tudublin;

import processing.core.PApplet;

public class Circle extends UIElement
{

    private float diameter;



public Circle (float x, float y ,float radius, float diameter, PApplet ui)
   {
       super(x, y, ui);

   
   this.diameter = diameter;
   radius = diameter/2;
   }

 
    float rotation;
    public void render()
    {
        for(int i = 0; i < 10; i++)
        {
            ui.noFill();
            ui.stroke(0,200,200);
            ui.ellipse(x,y, i*(20),i*(20));
        }
        ui.pushMatrix();
        ui.translate(x,y);
        ui.rotate(rotation);
        int outline = 50;
        for(int i =0; i< 10; i++)
        {
            ui.arc(0,0,outline,outline,0,ui.PI);
            outline += 1.8f ;
        }
       ui.popMatrix();
        rotation -= 0.02f;
        ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(rotation - 0.05f);
         outline = 100;
        for(int i = 0; i < 20; i++)
        {
            ui.stroke(200,200,0);
            ui.arc(0,0,outline,outline,1.6f,ui.PI);
              outline ++;
        }
        ui.popMatrix();
          rotation += 0.05f;

    }
 
}
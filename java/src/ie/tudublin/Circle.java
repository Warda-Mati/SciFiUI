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
        for(int i = 0; i < 5; i++) // circles 
        {
            ui.noFill();
            ui.stroke(0,200,200);
            ui.ellipse(x,y, i*(25),i*(25)); // makes static circles small / big
        }
        ui.pushMatrix();
        ui.translate(x,y);
        ui.rotate(rotation);
        int outline = 75;   //  semi arc 's position
        for(int i =0; i< 10; i++) //  thickness of arc 
        {
            ui.arc(0,0,outline,outline,0,ui.PI); // size of semi arc | starting point  
            outline += 10 ; // size
        }
       ui.popMatrix();
        rotation -= 0.02f; // rotation speed
        ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(rotation - 0.05f); // speed 
         outline = 100;
        for(int i = 0; i < 20; i++)
        {
            ui.stroke(200,200,0);
            ui.arc(0,0,outline,outline,1.60f,ui.PI);
              outline += 1;
        }
        ui.popMatrix();
          rotation += 0.95f;
    }
}

// noStroke();
// lights();
// translate(58, 48, 0);
// sphere(28);
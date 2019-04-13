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

    float rotation = 0;
    float rotation1 = 0;
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
            ui.stroke(0 + (i*30),0 + (i*10),0 + (i*25));
            ui.arc(0,0,outline,outline,0,ui.PI); // size of semi arc | starting point  
            outline += 10 ; // size
        }
       ui.popMatrix();
        rotation -= 0.8f; // rotation speed
      
    }

//     for (int i = 0; i < 50; i++)
//     {
//        ui. noFill();
//        // stroke(255, 128,128);
//        ui.stroke(ui.random(170),ui.random(170), ui.random(170));
//        ui.ellipse(x, y, 20+(i*3), 20+(i*3));
//     }

//     ui.pushMatrix();
//     ui.translate(x,y);
//     ui.rotate(rotation);
//     int outline = 200;
//     for(int i =0; i < 5; i++)
//     {
//         ui.strokeWeight(3);
//         ui.stroke(ui.random(170),ui.random(170), ui.random(170));
//       //  stroke(0, 255,89);
//       ui.arc(0, 0, outline, outline, 0, ui.PI);
//         outline += 10;
//         ui.strokeWeight(1);
//     }
//     ui.popMatrix();
//     rotation -=0.5f;

// //2nd one 
//     ui.pushMatrix();
//     ui.translate(x,y);
//     ui.rotate(rotation1);
//     int outline1 = 200;

//     for(int i = 0;i < 5; i++)
//     {
//         ui.strokeWeight(2);
//        // stroke(0 + (i*30),0 + (i*10),0 + (i*25));
//        ui.stroke(ui.random(170),ui.random(170), ui.random(170));
//        ui.arc(0, 0, outline1, outline1, 0, ui.PI);
//         outline1 +=10;
//         ui.strokeWeight(1);
//     }
//     ui.popMatrix();
//     rotation1 += 0.2f;
//     }
}


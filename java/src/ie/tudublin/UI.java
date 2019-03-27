package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
public class UI extends PApplet
{
    ArrayList<Radar> radars = new ArrayList<Radar>();
    ArrayList<RadarBorder> borders = new ArrayList<RadarBorder>();
     
    Button b;
    MovingCircle mc;
    Radar r;
    Radar r2;
    RadarBorder border;
    RadarBorder border2;
    RadarBorder border3;
    Rectangles rec; // small rectangles  above squares  
    SquareButtons button; // squares at the bottom 
    HorizontalLines horizonline; // line at the bottom 
    Rectangles rec1; // rectangles at the bottom of the square buttons

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    
    public void settings()
    {
        fullScreen();  // Use fullscreen instead of size to make your interface fullscreen
    }

    public void setup()
    {
        colorMode(HSB);
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        r = new Radar(900, 700, 50, this);
        r2 = new Radar(50,100,50,this);  
        border = new RadarBorder(width/2 - 400,height/2 - 100 , 80, 10,this," Balanced");
        border2 = new RadarBorder(width/2 +100,height/2 - 100,80,10,this,"Balanced");  
        border3 = new RadarBorder(width/2 + 200, height/2-100, 80, 10, this, "Balanced"); 
        rec = new Rectangles(600, 500, 400, 10,this, 240); // x , y, width, height , colour 
        rec1 = new Rectangles(10, 730, 100, 10, this,264);
        button = new SquareButtons(400,500, 50, 50,this); 
        horizonline = new HorizontalLines(0, 750, width - 40 , this);

        for (int i=0; i < 10; i++) // circle | radar 
        {
            Radar rr = new Radar(i *50, 200, 50, this);
            radars.add(rr);
        }

        for (int i=0; i < 3; i++) // radar border 
        {
            RadarBorder bb = new RadarBorder(i* 50 , height/2 -100, 80, 10, this , "Balance");
            borders.add(bb);
        }
       

    }

    public void draw()
    {
        background(0);
        // b.render();
        // mc.update();
        // mc.render();
        r.render();
        r2.render();
        border.render();
        border2.render();
        border3.render();
        rec.render(false);
        rec1.render(true);
        button.render();
        horizonline.render();

        for(Radar rr: radars) // radar , CIRCLE WITH LINES IN IT 
        {
            rr.render();
        }

        for(RadarBorder bb: borders) // radar , CIRCLE WITH LINES IN IT 
        {
            bb.render();
        }

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}


package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
public class UI extends PApplet
{
   // ArrayList<Radar> radars = new ArrayList<Radar>();
    ArrayList<RadarBorder> borders = new ArrayList<RadarBorder>();
    ArrayList<SquareButtons> buttons = new ArrayList<SquareButtons>();
    ArrayList<Rectangles> brects = new ArrayList<Rectangles>(); // rects above line at the bottom 
    ArrayList<HorizontalLines> lines = new ArrayList<HorizontalLines>();
 
     
    Button b;
    MovingCircle mc;
    Radar r;
    RadarBorder border;
    RadarBorder border2;
    RadarBorder border3;
    SquareButtons button; // squares at the bottom 
    HorizontalLines horizonline; // line at the bottom 
    Rectangles rec; // small  narrow long rectangles  above squares  
    Rectangles rec1; // rectangles at the bottom of the square buttons
    Rectangles rec2; // first on the left corner with the text arrange 

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
        border = new RadarBorder(width/2 - 400,height/2 - 100 , 80, 10,this," Balanced");
        border2 = new RadarBorder(width/2 +100,height/2 - 100,80,10,this,"Balanced");  
        border3 = new RadarBorder(width/2 + 200, height/2-100, 80, 10, this, "Balanced"); 
        rec = new Rectangles(700, 500, 400, 10,this, 125); // x , y, width, height , colour 
        rec1 = new Rectangles(50, 730, 100, 10, this,235);
        rec2 = new Rectangles(5, 650, 100, 20, this, 234);
        button = new SquareButtons(400,500,50,this); 
        horizonline = new HorizontalLines(0, 750, width - 40 , this);

        // for (int i=0; i < 10; i++) // circle | radar 
        // {
        //     Radar rr = new Radar(i *55, 50, 50, this);
        //     radars.add(rr);
        // }

        for (int i=0; i < 9; i++) // radar border 
        {
            RadarBorder bb = new RadarBorder(i* 105 , height/2 +50, 80, 20, this , "Balance"); // x (distance), y, move up/down, size 
            borders.add(bb);
        }
        for (int i=0; i < 3; i++) // Square buttons 
        {
            SquareButtons but = new SquareButtons(50, i*120, 50, this);
            buttons.add(but);
        }


        for (int i=0; i < 7; i++) //  rects at the bottom 
        {
           Rectangles rec = new Rectangles(i* 50, 400, 30, 50, this,224);
           brects.add(rec);
        }

        for (int i=0; i < 37; i++) // lines
        {
            HorizontalLines slines = new HorizontalLines(10, i* 20, 20, this);
            lines.add(slines);
        }

        
       

    }

    public void draw()
    {
        background(0);
        // b.render();
        // mc.update();
        // mc.render();
        r.render();
        // border.render();
        // border2.render();
        // border3.render();
        rec.render();
        rec1.render();
        rec2.render();
        button.render();
        horizonline.render();

        // for(Radar rr: radars) // radar , CIRCLE WITH LINES IN IT 
        // {
        //     rr.render();
        // }

        for(RadarBorder bb: borders) // radar border with circles inside 
        {
            bb.render();
        }

        for(SquareButtons bt: buttons) // 
        {
            bt.render();
        }

        for(Rectangles rec: brects) // 
        {
            rec.render();
        }

        for(HorizontalLines slines: lines) // 
        {
            slines.render();
        }

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}


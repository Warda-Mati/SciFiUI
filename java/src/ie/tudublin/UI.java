package ie.tudublin;

// warda 

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Radar r;
    Radar r2;
    RadarBorder border;
    RadarBorder border2;

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
        fullScreen();
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        r = new Radar(100, 200, 100, this);
        r2 = new Radar(50,100,100,this);  
        border = new RadarBorder(200,100 , 200, 50,this,"Nice Person helped me");
        border2 = new RadarBorder(300,250,200,50,this,"Mean Person helped me");     
    }

    public void draw()
    {
        background(0);
        b.render();

        mc.update();
        mc.render();

        r.render();
        r2.render();
        border.render();
        border2.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}


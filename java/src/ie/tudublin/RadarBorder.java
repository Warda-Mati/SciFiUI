package ie.tudublin;
import processing.core.PApplet;

public class RadarBorder extends UIElement {// fields 

    private int length;  // width 
    private int size;  // height
    //private int radius;
   // private int diameter;
    private String text; 
    

    public RadarBorder(int x, int y, int length, int size,/*int diameter*/ PApplet ui,String text) // constructor 
    {
        super(x, y, ui);
        this.length = length; 
        this.size = size; 
       // this.diameter = diameter; 
        this.text = text;
       // radius = diameter/2;
    }

    public void render()
    { 
        int gap = 25;
        int radius;
        // y + go down | y - go up | x + going right| x - going left 
        int linedistance = 100;  
        ui.noStroke();
        ui.fill(255,100,50);
        ui.stroke(255,100,50);
        // ui.line(x-20,y,x-20,y+linedistance); // left line 
        ui.line((x+length)+20, y, (x+length)+20, y+linedistance); // right line 
        // ui.line(x + length + gap, y, x+gap + length, y+distance );
        ui.rect(x, y, length, size); // x, y, width, height
        ui.fill(255); 
        //ui.ellipse(x,y,10,10);
        ui.fill(255);
        ui.textSize(10);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text,x+(length/2),y+(size/2));
       // ui.ellipse(x, y, diameter, diameter);

       ui.noFill();

       ui.stroke(255,255,102);
       ui.line(x+(length/6),y+30,x+(length/6),y+ 17);
       ui.stroke(102,153,255);
       ui.ellipse(x+(length/6), y + 30, 30, 30);


       ui.stroke(255,255,102);
       ui.line(x+(length/2) + gap,y+30,x+(length/2)+gap,y+ 17);
       ui.stroke(102,153,255);
       ui.ellipse(x+(length/2) + gap, y + 30, 30, 30);


       ui.stroke(255,255,102);
       ui.line(x+(length/6),y+90,x+(length/6),y+ 75);
       ui.stroke(102,153,255);
       ui.ellipse(x+(length/6), y + 90, 30, 30);


       ui.stroke(255,255,102);
       ui.line(x+(length/2) + gap,y+90,x+(length/2) + gap,y+ 75);
       ui.stroke(102,153,255);
       ui.ellipse(x+(length/2) + gap, y + 90, 30, 30);
    //    ui.stroke(255,255,102);
    //    ui.line(x,(y-radius),x,(y-radius) + 10);  
    //    ui.stroke(102,153,255);
    //    ui.ellipse(x,y,diameter,diameter); 
    } 
}




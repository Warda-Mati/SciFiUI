package ie.tudublin;
import processing.core.PApplet;

public class RadarBorder extends UIElement {
    private int length;  
    private int size;  
    private String text; 
    float rotation = 0;
    float rotation2 = 0;
    float rotation3 = 0;
    float rotation4 = 0;

    
    public RadarBorder(int x, int y, int length, int size, PApplet ui,String text) // constructor 
    {
        super(x, y, ui);
        this.length = length; 
        this.size = size; 
        this.text = text;

    }

    public void render()
    { 
        int gap = 10; 
        int linedistance = 100;  
        ui.noStroke();
        ui.fill(255,100,50);
        ui.stroke(255,100,50);
        ui.line((x+length)+gap, y, (x+length)+gap, y+linedistance); // right line 
        ui.rect(x, y, length, size); // x, y, width, height
        ui.fill(255); 
       
        ui.fill(255);
        ui.textSize(10);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text,x+(length/2),y+(size/2));

        float linelength = linedistance - size;
        float diameter = (linelength/2) - gap;
        //circles drawn
        ui.noFill();
        ui.stroke(0,250,250);
        ui.ellipse(x+(length/4),y+(size + (linelength/4) ), diameter, diameter);
        ui.ellipse(x+(3*(length/4)),y+(size + (linelength/4) ), diameter, diameter);
        ui.ellipse(x+(length/4),y+(size + 3*(linelength/4) ), diameter, diameter);
        ui.ellipse(x+(3*(length/4)),y+(size + 3*(linelength/4) ), diameter, diameter);

        //lines drawn
        ui.fill(255);
        ui.line(x+3*(length/4),y+(size + (linelength/4)), x+3*(length/4),y+(size + (linelength/4) - (diameter/2))); 
        ui.line(x+(length/4),y+(size + 3*(linelength/4)), x+(length/4),y+(size + 3*(linelength/4) - (diameter/2))); 
     
      
        
        // top left circle 
        ui.pushMatrix();
        ui.translate(x+length/4, y+(size + (linelength/4)));
        ui.rotate(rotation);
        ui.line(0,0,diameter/2 -5,diameter/2-5); 
        rotation -= 0.2f;
        ui.popMatrix();

        //  top right 
        ui.pushMatrix();
        ui.translate(x+3*(length/4),y+(size + (linelength/4)));
        ui.rotate(rotation2);
        ui.line(0,0,diameter/2 -5,diameter/2-5); 
        rotation2 -= 0.2f;
        ui.popMatrix();


        // bottom right
        ui.pushMatrix();
        ui.translate(x+(length/4),y+(size + 3*(linelength/4)));
        ui.rotate(rotation3);
        ui.line(0,0,diameter/2 -5,diameter/2-5); 
        rotation3 -= 0.2f;
        ui.popMatrix();

        // bottom left 

        ui.pushMatrix();
        ui.translate(x+3*(length/4),y+(size + 3*(linelength/4)));
        ui.rotate(rotation4);
        ui.line(0,0,diameter/2 -5,diameter/2-5); 
        rotation4 -= 0.2f;
        ui.popMatrix();



        


















    } 



}




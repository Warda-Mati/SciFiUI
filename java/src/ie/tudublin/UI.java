package ie.tudublin;
import java.util.ArrayList;
import processing.core.PApplet;
public class UI extends PApplet
{
    ArrayList<RadarBorder> borders = new ArrayList<RadarBorder>(); // radar boerder with circle inside 
    ArrayList<SquareButtons> buttons = new ArrayList<SquareButtons>(); // square button at the bottom 
    ArrayList<SquareButtons> sbutton = new ArrayList<SquareButtons>();
    ArrayList<SquareButtons> sbutton2 = new ArrayList<SquareButtons>();
    ArrayList<Rectangles> brects = new ArrayList<Rectangles>(); // rects above line at the bottom  below square button 
    ArrayList<HorizontalLines> lines = new ArrayList<HorizontalLines>(); // small line onn the LHS 
    ArrayList<VerticlesLines> vline = new ArrayList<VerticlesLines>(); // verticle lines at the bottom below square buttons 
    ArrayList<Rectangles> srects = new ArrayList<Rectangles>(); // small  narrow long rectangles  above squares  | horizontally drawn
    ArrayList<Rectangles> vrects = new ArrayList<Rectangles>(); // small  narrow long rectangles  above squares  | vertically drawn
    ArrayList<HorizontalLines> hline = new ArrayList<HorizontalLines>(); //  
    ArrayList<HorizontalThinLine> tlines = new ArrayList<HorizontalThinLine>(); // thin lines added between verticle line 
    ArrayList<VThinLines> vlines = new ArrayList<VThinLines>();



    Button b;
    MovingCircle mc;
   //HorizontalLines hline;
    RadarBorder border;
    HorizontalLines horizonline; // line at the bottom 
    Rectangles rec; //  above rect 2
    Rectangles rec1; // first on the left corner with the text arrange 
    Rectangles rec2; // above rect 1 which is with text 
    Rectangles rec3; // big square box where circle is gonn a be 
    Rectangles rec4; // above rect above rec
    Circle circles;
    SquareBox box; 
    TextBox text;
    TextBox text2;
    TextBox text3;
    TextBox text4;
   


    boolean[] keys = new boolean[1024];
    public void keyPressed() {
        keys[keyCode] = true;
    }
    
    public void keyReleased() {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c) {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    
    public void settings(){
        fullScreen();  // Use fullscreen instead of size to make your interface fullscreen
    }






    public void setup() {

        colorMode(HSB);
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        border = new RadarBorder(width/2 - 400,height/2 - 100 , 80, 10,this," Balanced");
       // rec = new Rectangles(700, 500, 400, 10,this, 125,89,0); // x , y, width, height , colour 
        rec = new Rectangles(50, 400, 100, 250, this,235,90,78);
       // rec1= new Rectangles(50, 690, 100, 50, this, 234,5,6);  // with text 
        rec2 = new Rectangles(50, 290, 100, 100, this, 245, 0, 78); 
        rec3 = new Rectangles(250, 120, 250, 250, this, 0, 102,103);
        rec4 = new Rectangles(50, 140, 100, 130, this, 0, 103, 102);
      //  button = new SquareButtons(400,500,50,this); 
        horizonline = new HorizontalLines(0, 750, width - 40 , this);
       // hline = new HorizontalLines(250, 40, 900, this);
       circles = new Circle(315 + 250/4, 180 + 250/4, 80, 80 , this);
       box = new SquareBox(500,300 ,600, 400, this);
      text = new TextBox(50, 690, 50, 100, "Arrage", this); // box with text
      text2 = new TextBox(650, 310, 30, 130, "Track Write", this);
      text3 = new TextBox(790, 310, 30, 130, "Data", this);
      text4 = new TextBox(790, 200, 30, 130,"£ TX..", this);
    





        for (int i=0; i < 9; i++) // radar border 
        {
            RadarBorder bb = new RadarBorder(250+(i* 105) , height/2 +20, 80, 10, this , "Balance"); // x (distance), y, move up/down, size 
            borders.add(bb);
        }



        for (int i=0; i < 16; i++) // Square buttons 
        {
            fill(255);
            SquareButtons but = new SquareButtons(250+(i*60), 620, 50, this);  
            buttons.add(but);
        }


        for (int i=0; i < 4; i++) // Square buttons 
        {
            fill(255);
            SquareButtons sbut = new SquareButtons(650+(i*73), 250, 50, this);  
            sbutton.add(sbut);
        }

        for (int i=0; i < 2; i++) // Square buttons 
        {
            fill(255);
            SquareButtons sbut2 = new SquareButtons(790+(i*73), 140, 50, this);  
            sbutton2.add(sbut2);
        }




        for (int i=0; i < 6; i++) //  rects at the bottom 
        {
           Rectangles rec = new Rectangles(250+(i*160), 720, 150, 15, this,255,0,0); //width, move up/down,  distance , height 
           brects.add(rec);
        }




        for (int i=0; i < 37; i++) // lines
        {
            HorizontalLines slines = new HorizontalLines(10, i* 20, 20, this);
            lines.add(slines);
        }




        for (int i=0; i < 15; i++) // lines
        {
            HorizontalLines slines = new HorizontalLines(1340, 150+(i* 40), 40, this);
            lines.add(slines);
        }



        for (int i=0; i < 20; i++) // lines 
        {
            VerticlesLines vline1 = new VerticlesLines(250+(i*50), 690, 20, this);
            vline.add(vline1); 
        }
        // for (int i=0; i < 5; i++) //  rects at the bottom  
        // {   
        //    Rectangles srec = new Rectangles(250+(i*100), 500, 400, 10, this, 125, 89, 0); //width, move up/down,  distance , height 
        //    srects.add(srec); 
        // }




        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
           Rectangles vrec = new Rectangles(250, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           vrects.add(vrec);
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
           Rectangles vrec = new Rectangles(550, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           vrects.add(vrec);
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
           Rectangles vrec = new Rectangles(860, 530+(i*20), 330, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           vrects.add(vrec);
        }




        for (int i=0; i < 15; i++) // lines
        {
            HorizontalLines hlines = new HorizontalLines(200, 50, 1100, this);
            hline.add(hlines);
        }


        for(int i = 0; i < 74; i++)
        {
            HorizontalThinLine tline = new HorizontalThinLine(10, i*10, 20, this);
            tlines.add(tline);
        }


        for(int i = 0; i < 30; i++)
        {
            HorizontalThinLine tline = new HorizontalThinLine(1340, 150+(i*20), 40,this); // (1340, 150+(i* 40), 40, this)
            tlines.add(tline);
        }



        for(int i = 0; i < 94; i++)
        {
            VThinLines vline = new VThinLines(250+(i*10),height/2 +5, 10, this);
            vlines.add(vline);
        }


        for(int i = 0; i < 94; i++)
        {
            VThinLines vline = new VThinLines(250+(i*10),height/2 +125, 10, this);
            vlines.add(vline);
        }

        for (int i=0; i < 8; i++) // lines  above radar borer 
        {
            VerticlesLines vline1 = new VerticlesLines(650+(i*38), 350, 20, this);
            vline.add(vline1); 
        }










    }

    public void draw()
    {
        background(0);
        // b.render();
        // mc.update();
        // mc.render();
        // border.render();
       // rec.render();
        rec.render();
       // rec1.render();
        rec2.render();
        rec3.render();
        rec4.render();
        circles.render();
        box.render();
        //hline.render();
     //   button.render();
        horizonline.render();
       text.render();
       text2.render();
       text3.render();
       text4.render();
       

      
        for(RadarBorder bb: borders) // radar border with circles inside 
        {
            bb.render();
        }

        for(SquareButtons bt: buttons) // 
        {

            for(int i = 0; i < 16; i++)
            {
                int num = i + 1;
                textSize(10);
                text(num,250+(i*60) + 25,610); // x,  (250+(i*60), 620, 50, this); 
            }
            bt.render();
        }


        for(SquareButtons sbt: sbutton) 
        {

            for(int i = 0; i < 4; i++)
            {
                int num = i + 1;
                textSize(10);
                text(num,650+(i*73) + 25,240); // x, 
            }
            sbt.render();
        }

        for(SquareButtons sbt2: sbutton2) // 650+(i*73), 220, 50, this
        {

            for(int i = 0; i < 2; i++)
            {
                int num = i + 1;
                textSize(10);
                text(num,790+(i*73) + 25,130); // x, 
            }
            sbt2.render();
        }

        for(Rectangles rec: brects) // 
        {
            rec.render();
        }

        for(HorizontalLines slines: lines) // 
        {
            slines.render();
        }

        for (VerticlesLines vline1: vline )
        {
            vline1.render();
        }

        // for(Rectangles srec: srects) // 
        // {
        //     srec.render();
        // }

        for(Rectangles vrec: vrects) 
        {
            vrec.render();
        }


        for(HorizontalLines hlines: hline) 
        {
            hlines.render();
        }


        for(HorizontalThinLine tline: tlines)
        {
            tline.render();
        }


        for(VThinLines vline: vlines)
        {
            vline.render();
        }
        

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}


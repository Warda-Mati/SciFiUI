package ie.tudublin;
import java.util.ArrayList;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;
public class UI extends PApplet
{
    Minim  minim;
    AudioPlayer[] songs = new AudioPlayer[16];
    // ArrayList<RadarBorder> borders = new ArrayList<RadarBorder>(); // radar boerder with circle inside 
       ArrayList<SquareButtons> buttons = new ArrayList<SquareButtons>(); // square button at the bottom 
    // ArrayList<SquareButtons> sbutton = new ArrayList<SquareButtons>(); // 4 buttons at the top
    // ArrayList<SquareButtons> sbutton2 = new ArrayList<SquareButtons>(); // 2 buttons at the top
    // ArrayList<SquareButtons> sbutton3 = new ArrayList<SquareButtons>(); // buttons in box on the left side 
    // ArrayList<Rectangles> brects = new ArrayList<Rectangles>(); // rects above line at the bottom  below square button 
    // ArrayList<HorizontalLines> lines = new ArrayList<HorizontalLines>(); // small line onn the LHS 
    // ArrayList<VerticlesLines> vline = new ArrayList<VerticlesLines>(); // verticle lines at the bottom below square buttons 
    // ArrayList<Rectangles> srects = new ArrayList<Rectangles>(); // small  narrow long rectangles  above squares  | horizontally drawn
    // ArrayList<Rectangles> vrects = new ArrayList<Rectangles>(); // small  narrow long rectangles  above squares  | vertically drawn
    // ArrayList<HorizontalLines> hline = new ArrayList<HorizontalLines>(); 
    // ArrayList<HorizontalLines> hline1 = new ArrayList<HorizontalLines>();//  inside box 
    // ArrayList<HorizontalThinLine> tlines = new ArrayList<HorizontalThinLine>(); // thin lines added between verticle line 
    // ArrayList<HorizontalThinLine> tlines1 = new ArrayList<HorizontalThinLine>();
    // ArrayList<VThinLines> vlines = new ArrayList<VThinLines>();
    ArrayList<UIElement> elements = new ArrayList<UIElement>();

    Button b;
    MovingCircle mc;
    RadarBorder border;
    HorizontalLines horizonline;//line at the bottom 
    Boxes rec1;//1 
    Boxes rec2;//2   
    Boxes rec3;//big square box where circle is 
    Boxes rec4;//3 above rect rect 2
    Circle circles;
    SquareBox box; 
    TextBox text;
    TextBox text2;
    TextBox text3;
    TextBox text4;
    SlideBar bar;
   


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

        //colorMode(HSB);
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        border = new RadarBorder(width/2 - 400,height/2 - 100 , 80, 10,this," Balanced");
        rec1 = new Boxes(50, 420, 150, 250, this,235,90,78);  // x,y,width,height,colour 
        rec2 = new Boxes(50, 250, 150, 150, this, 245, 0, 78); 
        rec3 = new Boxes(250, 120, 250, 250, this, 0, 102,103);
        rec4 = new Boxes(50, 120, 150, 120, this, 0, 103, 102);
        // button = new SquareButtons(400,500,50,this); 
        horizonline = new HorizontalLines(0, 750, width - 40 , this);
        // hline = new HorizontalLines(250, 40, 900, this);
       circles = new Circle(315 + 250/4, 180 + 250/4, 80, 80 , this);
       box = new SquareBox(520,290 ,40, 40, this);
       text = new TextBox(50, 690, 50, 150, "Arrage", this); 
       text2 = new TextBox(650, 310, 30, 130, "Track Write", this);
       text3 = new TextBox(790, 310, 30, 130, "Data", this);
       text4 = new TextBox(790, 200, 30, 130,"£ TX..", this);
       bar = new SlideBar(650, 100, this, 100, 30);
       minim = new Minim(this);
       songs[1] = minim.loadFile("musicrap1.mp3");
       songs[2] = minim.loadFile("kala.mp3");
       songs[3] = minim.loadFile("Swag.mp3");
       songs[4] = minim.loadFile("Chamma.mp3");
       songs[5] = minim.loadFile("Dilbar.mp3");
       songs[6] = minim.loadFile("Mujhse.mp3");

       
    


        for (int i=0; i < 9; i++) // radar border 
        {
            //RadarBorder bb = new RadarBorder(250+(i* 105),height/2 +20, 80, 10, this , "Balance");
            //borders.add(bb);
            UIElement bb = new RadarBorder(250+(i* 105) , height/2 +20, 80, 10, this , "Balance"); // x (distance), y, move up/down, size 
            elements.add(bb);
        }



        for (int i=0; i < 16; i++) // Square buttons 
        {
            fill(255);
            SquareButtons but = new SquareButtons(250+(i*60), 620, 50, i+1, this); 
            //UIElement but = new SquareButtons(250+(i*60), 620, 50, this);   
            buttons.add(but);
           // elements.add(but);
        }

        for (int i=0; i < 4; i++) // Square buttons 
        {
            fill(255);
            //SquareButtons sbut = new SquareButtons(650+(i*73), 250, 50, this);  
            //sbutton.add(sbut);
            UIElement sbut = new SquareButtons(650+(i*73), 250, 50, 0, this);  
            elements.add(sbut);
        }

        for (int i=0; i < 2; i++) // Square buttons  inside box
        {
            fill(255);
            // SquareButtons sbut2 = new SquareButtons(790+(i*73), 140, 50, this);  
            // sbutton2.add(sbut2);
            UIElement sbut2 = new SquareButtons(790+(i*73), 140, 50, 0, this);  
            elements.add(sbut2);
        }


        for (int i=0; i < 2; i++) // Square buttons  
        {
            fill(255);
            // SquareButtons sbut3 = new SquareButtons(59+(i*80), 440, 50, this);  
            //  sbutton3.add(sbut3);
            UIElement sbut3 = new SquareButtons(59+(i*80), 440, 50,0, this);  
            elements.add(sbut3);
           
        }

        for (int i=0; i < 2; i++) // Square buttons  inside box 
        {
            fill(255);
            // SquareButtons sbut2 = new SquareButtons(59+(i*80), 600, 50, this);  
            // sbutton2.add(sbut2);
            UIElement sbut2 = new SquareButtons(59+(i*80), 600, 50,0, this);  
            elements.add(sbut2);
        }


        for (int i=0; i < 6; i++) //  rects at the bottom 
        {
        //    Rectangles rec = new Rectangles(250+(i*160), 720, 150, 15, this,255,0,0); //width, move up/down,  distance , height 
        //    brects.add(rec);
             UIElement  rec= new Rectangles(250+(i*160), 720, 150, 15, this,255,0,0); //width, move up/down,  distance , height 
             elements.add(rec);
        }




        for (int i=0; i < 37; i++) // lines
        {
            // HorizontalLines slines = new HorizontalLines(10, i* 20, 20, this);
            // lines.add(slines);
           UIElement slines = new HorizontalLines(10, i* 20, 20, this);
           elements.add(slines);
        }




        for (int i=0; i < 15; i++) // lines
        {
            // HorizontalLines slines = new HorizontalLines(1340, 150+(i* 40), 40, this);
            // lines.add(slines);

            UIElement slines = new HorizontalLines(1340, 150+(i* 40), 40, this);
            elements.add(slines);
        }



        for (int i=0; i < 20; i++) // lines 
        {
            // VerticlesLines vline1 = new VerticlesLines(250+(i*50), 690, 20, this);
            // vline.add(vline1); 

             UIElement vline1 = new VerticlesLines(250+(i*50), 690, 20, this);
            elements.add(vline1); 
        }
        // for (int i=0; i < 5; i++) //  rects at the bottom  
        // {   
        //    Rectangles srec = new Rectangles(250+(i*100), 500, 400, 10, this, 125, 89, 0); //width, move up/down,  distance , height 
        //    srects.add(srec); 
        // }




        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
        //    Rectangles vrec = new Rectangles(250, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
        //    vrects.add(vrec);
            UIElement vrec = new Rectangles(250, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
             elements.add(vrec);
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
        //    Rectangles vrec = new Rectangles(550, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
        //    vrects.add(vrec);

           UIElement vrec = new Rectangles(550, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           elements.add(vrec);
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
        //    Rectangles vrec = new Rectangles(860, 530+(i*20), 330, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
        //    vrects.add(vrec);

           UIElement vrec = new Rectangles(860, 530+(i*20), 330, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           elements.add(vrec);
        }




        for (int i=0; i < 15; i++) // lines
        {
            // HorizontalLines hlines = new HorizontalLines(200, 50, 1100, this);
            // hline.add(hlines);

            UIElement hlines = new HorizontalLines(200, 50, 1100, this);
             elements.add(hlines);
        }


        for(int i = 0; i < 74; i++)
        {
            // HorizontalThinLine tline = new HorizontalThinLine(10, i*10, 20, this);
            // tlines.add(tline);

            UIElement tline = new HorizontalThinLine(10, i*10, 20, this);
            elements.add(tline);
        }


        for(int i = 0; i < 30; i++)
        {
            // HorizontalThinLine tline = new HorizontalThinLine(1340, 150+(i*20), 40,this); 
            // tlines.add(tline);

            UIElement tline = new HorizontalThinLine(1340, 150+(i*20), 40,this); 
            elements.add(tline);
        }

        // inside box 
        for(int i = 0; i < 5; i++)
        {
            // HorizontalThinLine tline1 = new HorizontalThinLine(59, 510+(i*20), 40,this); 
            // tlines1.add(tline1);
            UIElement tline1 = new HorizontalThinLine(59, 510+(i*20), 40,this); 
            elements.add(tline1);
        }

        for(int i = 0; i < 5; i++)
        {
            // HorizontalThinLine tline1 = new HorizontalThinLine(150, 510+(i*20), 40,this); 
            // tlines1.add(tline1);

           UIElement tline1 = new HorizontalThinLine(150, 510+(i*20), 40,this); 
           elements.add(tline1);
        }

        
        // inside box
        for (int i=0; i < 5; i++) // lines
        {
            // HorizontalLines hlines = new HorizontalLines(59, 500+(i*20), 40, this);
            // hline.add(hlines);

            UIElement hlines = new HorizontalLines(59, 500+(i*20), 40, this);
            elements.add(hlines);
        }

        for (int i=0; i < 5; i++) // lines
        {
            // HorizontalLines hlines = new HorizontalLines(150, 500+(i*20), 40, this);  
            // hline.add(hlines);

            UIElement hlines = new HorizontalLines(150, 500+(i*20), 40, this);  
            elements.add(hlines);
        }
        



        for(int i = 0; i < 94; i++)
        {
            // VThinLines vline = new VThinLines(250+(i*10),height/2 +5, 10, this);
            // vlines.add(vline);

            UIElement vline = new VThinLines(250+(i*10),height/2 +5, 10, this);
            elements.add(vline);
        }


        for(int i = 0; i < 94; i++)
        {
            // VThinLines vline = new VThinLines(250+(i*10),height/2 +125, 10, this);
            // vlines.add(vline);

            UIElement vline = new VThinLines(250+(i*10),height/2 +125, 10, this);
            elements.add(vline);
        }

        for (int i=0; i < 8; i++) // lines  above radar borer 
        {
        //     VerticlesLines vline1 = new VerticlesLines(650+(i*38), 350, 20, this);
        //     vline.add(vline1); 

             UIElement vline1 = new VerticlesLines(650+(i*38), 350, 20, this);
            elements.add(vline1); 
        }
        // }




    }
    int click = -1;
    boolean slide = false;
    public void mousePressed()
    {
        for(int i =0; i < 16; i++)
        {
            float x = buttons.get(i).x + (buttons.get(i).getLength()/4);
            float y = buttons.get(i).y + (buttons.get(i).getLength()/4);
            float size = buttons.get(i).getLength()/2;
            if(mouseX > x && mouseX < buttons.get(i).x + size && mouseY > y && mouseY < buttons.get(i).y + size)
            {
                if(click != -1)
                {
                    songs[click].pause();
                }
                songs[buttons.get(i).getNum()].play();
                songs[buttons.get(i).getNum()].loop();
                click = buttons.get(i).getNum();
            }
        }
        if(mouseX > bar.x && mouseX < bar.x + bar.getLength() && mouseY > bar.y && mouseY < bar.y + bar.getLength()/2)
        {
            slide = true;
        }
    }

    public void draw()
    {
        background(0);
        // b.render();
        // mc.update();
        // mc.render();
        // border.render();
      
       rec1.render();
       rec1.render();
       rec2.render();
       rec3.render();
       rec4.render();
        circles.render();
        box.render();
        //hline.render();
        //button.render();
        horizonline.render();
       text.render();
       text2.render();
       text3.render();
       text4.render();
       bar.render();

       for(UIElement element: elements)
       {
           element.render();
       }

       
       for(SquareButtons bt: buttons)
       {
           fill(255);
            textSize(20);
            
           text(click,40,40);
            bt.render();
       }

       if(slide = true && mouseY > bar.y && mouseY < bar.y + bar.getDistance())
       {
           bar.y = mouseY;
       }
       

      /*
        for(RadarBorder bb: borders) // radar border with circles inside 
        {
            bb.render();
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

        for(SquareButtons sbt3: sbutton3) // 650+(i*73), 220, 50, this
        {

            for(int i = 0; i < 2; i++)
            {
                int num = i + 1;
                textSize(10);
                text(num,790+(i*73) + 25,130); // x, 
            }
            sbt3.render();
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

        for(HorizontalThinLine tline1: tlines1)  // inside box 
        {
            tline1.render();
        }

        for(HorizontalLines hlines1: hline1)  // inside box
        {
            hlines1.render();
        }

        for(VThinLines vline: vlines)
        {
            vline.render();
        }*/
        
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

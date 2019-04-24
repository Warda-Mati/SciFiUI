package ie.tudublin;
import java.util.ArrayList;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
public class UI extends PApplet
{
    Minim  minim;
    AudioPlayer[] songs = new AudioPlayer[26];
    ArrayList<SquareButtons> buttons = new ArrayList<SquareButtons>(); // square button at the bottom 
    ArrayList<SlideBar>  bar = new ArrayList<SlideBar>();
    ArrayList<UIElement> elements = new ArrayList<UIElement>();
    ArrayList<SongList> list = new ArrayList<SongList>();
    ArrayList<Lights> light = new ArrayList<Lights>();
  


    
 
    RadarBorder border;
    HorizontalLines horizonline;//line at the bottom 
    Boxes rec1;//1 
    ColourSquares rec2;  //2 
    Boxes rec3;//big square box where circle is 
    Boxes rec4;//3 above rect rect 2
    Circle circles;
    SquareBox box; 
    TextBox text;
    TextBox text2;
    TextBox text3;
    TextBox text4;
    ChordChart chart;
    public static int sample = 64100;
    public static int resolution = 16;
    public static int frame = 1024;
    AudioInput ai;
   

   
 
    public void settings(){
        fullScreen();  // Use fullscreen instead of size to make your interface fullscreen
    }

    public void setup() {
    //colorMode(HSB);
    border = new RadarBorder(width/2 - 400,height/2 - 100 , 80, 10,this," Balanced");
    rec1 = new Boxes(50, 420, 150, 250, this,235,90,78);  // x,y,width,height,colour 
    rec2 = new ColourSquares(50, 80, 100, this);
    rec3 = new Boxes(250, 120, 250, 250, this, 0, 102,103);
    rec4 = new Boxes(50, 280, 150, 120, this, 0, 103, 102);
    horizonline = new HorizontalLines(0, 750, width - 40 , this);
    circles = new Circle(315 + 250/4, 180 + 250/4, 80, 80 , this);
    box = new SquareBox(660,140 ,70, 70, this);
    text = new TextBox(50, 690, 50, 150, "Arrage", this); 
    text2 = new TextBox(650, 310, 30, 130, "Track Write", this);
    text3 = new TextBox(790, 310, 30, 130, "Data", this);
    text4 = new TextBox(790, 200, 30, 130,"£ TX..", this);
     chart = new ChordChart(940, 80, 360, 290, this);// x, y, width, height
 
 
        // songs name
       minim = new Minim(this);
       songs[1] = minim.loadFile("musicrap1.mp3");
       songs[2] = minim.loadFile("kala.mp3");
       songs[3] = minim.loadFile("Swag.mp3");
       songs[4] = minim.loadFile("Chamma.mp3");
       songs[5] = minim.loadFile("Dilbar.mp3");
       songs[6] = minim.loadFile("Mujhse.mp3");
       songs[7] = minim.loadFile("Saiyaan Superstar.mp3");
       songs[8] = minim.loadFile("Shake Karaan.mp3");
       songs[9] = minim.loadFile("Cheez Badi Hai.mp3");
       songs[10] = minim.loadFile("Ding Dang.mp3");
       songs[11] = minim.loadFile("Kamariya.mp3");
       songs[12] = minim.loadFile("Mere saiyyan.mp3");
       songs[18] = minim.loadFile("Mere Rashke Qamar.mp3");
    //    songs[14] = minim.loadFile(".mp3");
    //    songs[15] = minim.loadFile(".mp3");
    //    songs[16] = minim.loadFile(".mp3");


        ai = minim.getLineIn(minim.MONO, frame, sample, resolution);
        loadSong();
        // lights 
        for(int i = 0; i < 8; i++)
        {
            boolean direction;
            if(i%2 == 0)
            {
                direction = false;
            }
            else
            {
                direction = true;
            }
            
            Lights l = new Lights(200 + (i*150), height, this, 100, direction);
            light.add(l);
        }

       
        
        // radar Border
        for (int i=0; i < 9; i++) 
        {
            UIElement bb = new RadarBorder(250+(i* 105) , height/2 +20, 80, 10, this , "Balance"); // x (distance), y, move up/down, size 
            elements.add(bb);
        }

        // button at the botom
        for (int i=0; i < 16; i++) 
        {
            fill(255);
            SquareButtons but = new SquareButtons(250+(i*60), 620, 50, i+1, this);  
            buttons.add(but);
        }

        // Square buttons beside circle 
        for (int i=0; i < 4; i++) 
        {
            fill(255);
            SquareButtons but  = new SquareButtons(650+(i*73), 250, 50, 17+i, this);  
            buttons.add(but);
            // UIElement sbut = new SquareButtons(650+(i*73), 250, 50, 17+i, this);  
            // elements.add(sbut);
        }

        for (int i=0; i < 2; i++) // Square buttons  inside box
        {
            fill(255);
            UIElement sbut2 = new SquareButtons(790+(i*73), 140, 50, 21+i, this);  
            elements.add(sbut2);
        }


        for (int i=0; i < 2; i++) // Square buttons  inside box
        {
            fill(255);
            UIElement sbut3 = new SquareButtons(59+(i*80), 440, 50,23+i, this);  
            elements.add(sbut3);
           
        }

        for (int i=0; i < 2; i++) // Square buttons  inside box 
        {
            fill(255);
            UIElement sbut2 = new SquareButtons(59+(i*80), 600, 50,25+i, this);  
            elements.add(sbut2);
        }


        for (int i=0; i < 6; i++) //  rects at the bottom 
        {
             UIElement  rec= new Rectangles(250+(i*160), 720, 150, 15, this,255,0,70); //width, move up/down,  distance , height 
             elements.add(rec);
        }


        for (int i=0; i < 37; i++) // lines
        {
           UIElement slines = new HorizontalLines(10, i* 20, 20, this);
           elements.add(slines);
        }




        for (int i=0; i < 37; i++) // lines
        {
            UIElement slines = new HorizontalLines(1340, i* 20, 20, this);
            elements.add(slines);
        }



        for (int i=0; i < 20; i++) // lines 
        {
             UIElement vline1 = new VerticlesLines(250+(i*50), 690, 20, this);
            elements.add(vline1); 
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
            UIElement vrec = new Rectangles(250, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
             elements.add(vrec);
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
           UIElement vrec = new Rectangles(550, 530+(i*20), 340, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           elements.add(vrec);
        }



        for (int i=0; i < 3; i++) //  rects at the bottom  
        {
           UIElement vrec = new Rectangles(860, 530+(i*20), 330, 6, this, 125, 89, 0); //width, move up/down,  distance , height 
           elements.add(vrec);
        }



        for (int i=0; i < 15; i++) // lines
        {
            UIElement hlines = new HorizontalLines(200, 50, 1100, this);
             elements.add(hlines);
        }


        for(int i = 0; i < 74; i++)
        {
            UIElement tline = new HorizontalThinLine(10, i*10, 20, this);
            elements.add(tline);
        }


        for(int i = 0; i < 74; i++)
        {
            UIElement tline = new HorizontalThinLine(1340, (i*10), 20,this); 
            elements.add(tline);
        }

        // inside box 
        for(int i = 0; i < 5; i++)
        {
            UIElement tline1 = new HorizontalThinLine(59, 510+(i*20), 40,this); 
            elements.add(tline1);
        }

        for(int i = 0; i < 5; i++)
        {
           UIElement tline1 = new HorizontalThinLine(150, 510+(i*20), 40,this); 
           elements.add(tline1);
        }

        
        // inside box
        for (int i=0; i < 5; i++) // lines
        {          
            UIElement hlines = new HorizontalLines(59, 500+(i*20), 40, this);
            elements.add(hlines);
        }

        for (int i=0; i < 5; i++) // lines
        {
            UIElement hlines = new HorizontalLines(150, 500+(i*20), 40, this);  
            elements.add(hlines);
        }
        

        for(int i = 0; i < 94; i++)
        {
            UIElement vline = new VThinLines(250+(i*10),height/2 +5, 10, this);
            elements.add(vline);
        }


        for(int i = 0; i < 94; i++)
        {
            UIElement vline = new VThinLines(250+(i*10),height/2 +125, 10, this);
            elements.add(vline);
        }

        for (int i=0; i < 8; i++) // lines  above radar borer 
        {
             UIElement vline1 = new VerticlesLines(650+(i*38), 350, 20, this);
            elements.add(vline1); 
        }
        

        for(int i =0; i < 2; i++)
        {
            SlideBar sbar = new  SlideBar(520+(i*60), 120, this, 250, 50); //(520, 120, this, 250, 50);
            bar.add(sbar); // name in array
        }

    }
    int click = -1;
    int slider = -1;
    public void mousePressed()
    {
        for(int i =0; i < 20; i++)
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
                songs[buttons.get(i).getNum()].setGain(0);
                click = buttons.get(i).getNum();
            }
        }
        for(int i =0;  i < bar.size(); i++)
        {
            SlideBar s = bar.get(i);
            if(mouseX > s.x && mouseX < s.x + s.getLength() && mouseY > s.y && mouseY < s.y + s.getLength()/2)
            {
                s.setSliding(true);
                slider = i;

            }
        }
        
    }
    
    public void keyPressed()
    {
        for(SlideBar s : bar)
        {
            if(key == 'b' && s.isSliding() == true)
            {
                s.setSliding(false);
                slider = -1;
            }
        }
        if(key == 's' && songs[click].isPlaying() == true)
        {
            songs[click].pause();
        }
        if(key == 'p' && songs[click].isPlaying() == false) // play song 
        {
            songs[click].play();
            songs[click].loop();
        }
      
    }
    float showlight = 0;
    public void draw()
    {
        background(0);
    
       rec1.render();
       rec1.render();
       rec2.render();
       rec3.render();
       rec4.render();
       circles.render();
       box.render();
       horizonline.render();
       text.render();
       text2.render();
       text3.render();
       text4.render();
       chart.render();
 

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
       
       for(int i = 0; i < bar.size(); i++)
       {
           SlideBar s = bar.get(i);
           s.render();
           if(s.isSliding() == true && mouseY > s.getLiney()& mouseY < s.getLiney()+ s.getDistance() && click != -1 && slider == 0)
            {
                s.y = mouseY;
                float newVolume = map(s.y,s.getLiney(),s.getLiney() + s.getDistance(),60,-60);
                float num = map(s.y,s.getLiney(),s.getLiney() + s.getDistance(),20.0f,0.0f);
                songs[click].setGain(newVolume);
                text(songs[click].getGain(),100,100);
                text(newVolume,150,100);
                fill(0,255,255);
                textSize(15);
                text(num,700,180);
            }
           
        }
        
        
      colorMode(HSB);
      if(click != -1)
      {
        for(int i =0; i < songs[click].bufferSize();i++)
       {
           stroke(map(i,0,frame,0,255),255,255);
           line(i+300,50,i,50 + songs[click].left.get(i)*50);
       }
       }  
      
     

       colorMode(RGB);

       displaySong();
    }

    public void loadSong()
    {
        Table table = loadTable("songs.csv","header");
        for(TableRow row: table.rows())
        {
            SongList song = new SongList(row);
            list.add(song);
        }
    }

    public void displaySong()
    {
        for(SquareButtons b: buttons)
        {
            for(SongList song: list)
            {
                if(click == b.getNum() && b.getNum() == song.getSongno())
                {
                    textSize(15);
                    fill(0,255,255);
                    text(song.getSongno(),70,325);
                    text(song.getTitle(), 120, 325);
                }
            }
        }
    }
}

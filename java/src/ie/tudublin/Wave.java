// package ie.tudublin;

// import ddf.minim.AudioInput;
// import ddf.minim.Minim;
// import processing.core.PApplet;

// public class Wave 
// {
//     private static int sample = 64100;
//     private static int resolution = 16;
//     private static int frame = 1024;
//     Minim minim;
//     AudioInput aiai = minim.getLineIn(minim.MONO, frame, sample, resolution);
//     PApplet ui;
//     private float y;


//     public Wave(PApplet ui, float y)
//     {
//         this.ui = ui;
//         this.y = y;
//     }

//     public void render()
//     {
        
//         ui.colorMode(ui.HSB);
//         for(int i =0; i < ai.bufferSize();i++)
//         {
//             ui.stroke(ui.map(i,0,frame,0,255),255,255);
//             ui.line(i,y,i,y + ai.left.get(i)*y/2);
//         }
//     }


// }
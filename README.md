# SciFi UI Project

Name: Warda Bibi

Student Number:  C17323991

Fork this repository and use it a starter project for your assignment

# Description of the assignment

A UI for a futuristic DJ system, made with Java and Processing with some functions from the Minim library

# Instructions

You are able to click on the buttons labelled 1-16, each will in turn play a diffrent song. You can press s to stop the song from playing and p to play again. As well as that, there are 2 slider bars on the top, around the middle. You are able to click on the bar and slide it up or down and then press b to stop controlling the bar. The first one will control the volume of the song playing, while the second one will control the intensity of the light. Hover over the circle buttons to have a flashing background. If you hover over the colored squares in the top left, it will change color to green.

# How it works

There are multiple classes that are basically the designs made using shapes and rotations from the Processing libraries, for example the Circle class which draws multiple arcs using loops which rotate using translate, pushMatrix and popMatrix. They are all child classes of the super abstract class UIElements. Polymorphism is used when the elements are added to the elements arraylist of type UIElements. 

In the UI class, In mousePressed() there are a lot of things in it. First of all if the mouse is clicked within a Button object, a variable called click will be assigned the number of the Button object, which is a field of the Button class. An array called songs is made which holds all the different loaded mp3 files. Depending on what Button object is clicked, the click variable will be the index of the songs array, in which every button will play a different song.

If the song is played, using the variable click, the name of the song will be printed along with what number song. This is from the csv file created. The data was encapsulated using private fields in the SongList class. Then using the Processing built in classes Table and TableRow, the data was loaded into separate objects and placed in the list arraylist.

There are 2 instances of the Sliderbar class. There is a boolean variable to determine if it's clicked, in which if it is, the mouseY will match the position of the rect in the slider bar up to the lenght of the line in it.
The sliders do 2 diffrent things. For the first one it's the sound. Using the minim libraries, the volume is set depending on where the rect is on the line using the map function. The volume is assigned using the setGain() function.
The second one is the lights. The lights are drawn using a seperate Lights class. The intensity of the light is determined by the rect's position within the line, using the map function.

Using the distance function, if you hover over the circle buttons, which are objects of the BGbutton class a rect of size width and height will be drawn with random colors using random(). The BGbutton class implements the interface BackGroundLights, which has one method called change() which draws the rect.







# What I am most proud of in the assignment

What I am most proud of is the elaborate design I was able to create. It took a lot of classes for each individual element, even for small designs such as lines, but in the end the design turned out to be elegant and colorful. As well as that it just fit in of what I imagined a futuristic neon DJ system would be, not just in the design of the interface but also the funcionality. I'm impressed that I could make some functions such as playing songs and adjusting volume work. Last of all, I'm proud of the concepts of OOP that I have learned and practice I have gained over the month I have been working on the UI.

# Markdown Tutorial

This is *emphasis*
used 
Polymorphism  eg UI Element array list that contained many different sub classes. 
Abstract class  eg UI Element 
Interface class eg BackgroundLights that was implemented by BGbuttons.
Encapsulation   eg  Private field in every class where appropriated.
Inheritance eg UI Element had many sub classess.
File I/O eg songList class , data loaded from csv file.

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

https://github.com/Warda-Mati/SciFiUI/blob/master/images/Screen.PNG

This is an image using an absolute URL:


This is a youtube video:

https://www.youtube.com/watch?v=MLEwQDcfNrk&feature=youtu.be)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |


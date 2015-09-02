import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 150;
int startY = 0;
int endX = 0;
int endY = 150;

int personX = 0;
int randPos = (int)(Math.random()*100)-50;

int randB = (int)(Math.random()*100);

public void setup()
{
  size(300,300);
  strokeWeight(1.5f);
  background(40, 40, 40);
}

public void draw()
{
	//lightning bolt
	stroke(255,255,randB);
	while (endY < 300)
	{
		endY = startY + (int)(Math.random()*10);
		endX = startX + ((int)(Math.random()*19)-9);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}
	//little person
	fill(255);
	if (startX > 250){
		personX = endX - 70;
	} else if (startX < 110){
		personX = endX + 70;
	} else {
		personX = startX + randPos;
	}
	noStroke();
	ellipse(personX, 290, 10, 20);
	fill(0);
	ellipse(personX-2, 285, 2, 2);
	ellipse(personX+2, 285, 2, 2);
}

public void mousePressed()
{
	background(40, 40, 40);
	startX = (int)(Math.random()*201)+50; //random starting x position
	startY = 0;
	endX = 0;
	endY = 150;

	//random variations of yellow
	randB = (int)(Math.random()*154);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

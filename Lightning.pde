int startX = 150;
int startY = 0;
int endX = 0;
int endY = 150;

int randB = (int)(Math.random()*100);

void setup()
{
  size(300,300);
  strokeWeight(1.5);
  background(40, 40, 40);
}
void draw()
{
	stroke(255,255,randB);
	while (endY < 300)
	{
		endY = startY + (int)(Math.random()*10);
		endX = startX + ((int)(Math.random()*19)-9);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;

	}
}
void mousePressed()
{
	background(40, 40, 40);
	startX = (int)(Math.random()*201)+50; //random starting x position
	startY = 0;
	endX = 0;
	endY = 150;

	//random variations of yellow
	randB = (int)(Math.random()*154);
}

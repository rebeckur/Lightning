int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;

void setup()
{
  size(300,300);
  strokeWeight(5);
  background(82, 78, 78);
}
void draw()
{
	stroke(0);
	while (endX < 300)
	{
		line(startX, startY, endX, endY);
		endX = startX + (int)(Math.random()*10);
		endY = startY + (int)(Math.random()*19)-9;
	}
}
void mousePressed()
{

}

//int randR = (int)(Math.random()*256);
//int randG = (int)(Math.random()*256);
//int randB = (int)(Math.random()*256);
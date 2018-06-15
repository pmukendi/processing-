int i;                 //declare variable 
int a; 
int b; 
int c; 
int d; 
int e; 

class Gun {                        // making bullets
  float X = mouseX+ 15;
  float Y = 48;
  float Yspeed = random(2, 4);
  void shoot() { 
    Y =  Y + Yspeed;
    if (Y > height) {
      Y = 48;
    }
  }

  void show() {
    fill(#343232);
    stroke(#0D0606);
    strokeWeight(4);
    line(mouseX, Y, mouseX, Y+9);
  }
}

Gun[] bullet = new Gun[1];

void setup() {
  size(600, 770); // resolution 

  for (int i = mouseX; i < bullet.length; i++) {
    bullet[i] = new Gun();
  }
} 

void draw() {
  if (mousePressed == true) { 
    noCursor();
  } else {
    cursor (HAND);
  }

  background(#1AD82E);   //background color/screen
  fill(#7A7C7B);
  noStroke();
  rect(0, 0, 600, 55);            //bad guy floor 
  rect(0, 715, 600, 55);        //hero guy floor 
  stroke(0); 
  fill(#F20202);
  ellipse(mouseX, 740, 40, 40);            //hero guy
  noFill();
  fill(#835714);
  ellipse(mouseX, 40, 40, 40);         //bad guy 
  fill(#242926);
  rect(mouseX+15, 40, 10, 20);         //bad guy's gun
  fill(#0238F5);
  ellipse(200, 750, 20, 20);       //pedestrian
  ellipse(500, 760, 20, 20);       //pedestrian 2
  ellipse(50, 763, 20, 20);       //pedestrian 3
  ellipse(580, 750, 20, 20);       //pedestrian 4

  for (int i = 0; i < bullet.length; i++) {
    bullet[i].shoot();
    bullet[i].show();
  }
}

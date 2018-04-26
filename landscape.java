class Fish {
  float x = random(-100, width);
  float y = random(493, 547) ;
  float xspeed = random(1, 3);
  void swim() {
    x = x + xspeed;

    if (x > width) {
      x = random(-200);
    }
  }

  void show() { 

    fill(#919B9A);
    stroke(#787C7C);
    strokeWeight(4);
    line(x, y, x+7, y);
  }
}


Fish[] fishies = new Fish[10];

void setup() {
  size(600, 600);
  for (int i = 0; i < fishies.length; i++) {
    fishies[i] = new Fish();
  }
}

void draw() {
  background(#39E346);
  fill(#42F2E8);
  noStroke();
  rect(0, 0, 600, 400);
  fill(#C68636);
  stroke(#985A28);
  strokeWeight(4);
  rect(400, 300, 32, 110, 3); //tree
  stroke(0);
  rect(100, 370, 90, 90); //house
  stroke(0, 0, 0);
  rect(170, 310, 20, 37); //chimney
  triangle(80, 370, 147, 290, 210, 370); //roof
  noStroke();
  fill(#39E346);
  stroke(#299837);
  ellipse(415, 286, 110, 90); //leaves
  fill(#39E346);
  noStroke();
  rect(398, 407, 50, 18); //roots
  stroke(0);
  strokeWeight(1);
  fill(255, 255, 255);
  rect(123, 391, 30, 30); //window
  line(138, 392, 138, 421);
  line(123, 407, 152, 407); //frame
  noStroke();
  fill(200, 200, 200);
  ellipse(180, 280, 30, 30);
  ellipse(186, 270, 20, 20);
  ellipse(179, 250, 18, 20);
  ellipse(183, 227, 10, 10); //smoke
  stroke(#FFCE1A);
  fill(#F1FF34);
  ellipse(570, 30, 100, 100);//sun
  noStroke();
  fill(#4BCBF7);
  rect(0, 490, width, 60); //river

  for (int i = 0; i < fishies.length; i++) {  
    fishies[i].swim();
    fishies[i].show();                // fish
  }  
  println(mouseX, mouseY);
}

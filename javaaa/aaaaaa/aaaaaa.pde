void setup(){
  size(600,600);
}

void draw(){
  background(#39E346);
  fill(#42F2E8);
  noStroke();
  rect(0,0, 600, 400);
 fill(#C68636);
 stroke(#985A28);
 strokeWeight(4);
 rect(400, 300, 32, 110, 3); //tree
 stroke(0);
 rect(100, 370, 90, 90);
 stroke(0,0,0);
 rect(170, 310, 20,37);
 triangle(80, 370, 147, 290, 210, 370);
 noStroke();
 fill(#39E346);
 stroke(#299837);
 ellipse(415, 286, 110,90);
 fill(#39E346);
 noStroke();
 rect(398, 407, 50,18);
 fill(255,255,255);
 rect(123, 391, 30,30);
 println(mouseX, mouseY);
 
 
}

   PImage face;
   
   void setup() {
     
      size(800,600);
      
      face = loadImage("face.jpg");
      face.resize(800,600);
   }
   
   void draw() {
    
       image(face,0,0);
       
       System.out.println(mouseX + " : " + mouseY);
       ellipse(308, 358, 55, 62);
      ellipse(411, 358, 55, 59);
       ellipse(308, 358, 20, 20);
      ellipse(411, 358, 20, 20);
       //288 = X
       //331 = y
       
       //Draw an ellipse at the location 288, 331
   }

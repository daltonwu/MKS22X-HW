Blob[] blobs;
int popSize, rad, numSides;
int unit, wide;

/*=====================================
 The trickiest part of setup is to make 
 the screen an appropriate size for the
 grid of blobs. The grid should be just
 big enough to contain all of the blobs.
 ====================================*/
void setup() {
  popSize = 16;
  rad = 100;
  numSides = 4;
  unit = rad * 2;
  wide = ceil(sqrt(popSize)) * unit + 10;
  
  populate();
  size(wide, wide);
}

/*=====================================
 The main purpose of draw is to go through 
 the array of blobs and display each.
 ====================================*/
void draw() {
  
}

/*=====================================
 Populate the array of blobs.
 You can use any values for radius, number of sides
 and wobble factor that you'd like, but you must
 use x and y coordinates that ensure the blobs
 are drawn in a grid without overlapping each other.
 
 Your code should work for any reasonable value
 of population (i.e., something that would fit on a
 normal monitor).
 ====================================*/
void populate() {
  int c = 0;
  for(int i=0; i<wide; i++) {
    for(int g=0; g<wide; g++) {
      if(i == wide-1) {
        if(g > wide*wide-popSize) {
          break;
        }
        
        c++;
      }
    }
  }
}


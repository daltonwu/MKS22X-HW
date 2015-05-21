// Constants
int POPULATION_SIZE = 1;

// Global variables
int selectedX;
int selectedY;
int bestX;
int bestY;
boolean continuous = false;
float totalFitness;
int speed;
int generation;
float mutationRate = 0.05;

int RADIUS = 100; // radius of the grid; research wath RADIUS means
int WIDTH = ceil(sqrt(POPULATION_SIZE));

// The individuals
Individual[] population;
Individual selected;

/*=====================================
  Create an initial population of randomly
  generated individuals.
  Set up the basic window properties.
  ====================================*/
void setup() {
  size(RADIUS * WIDTH, RADIUS * WIDTH);
  
}

/*=====================================
  Redraw every Individual in the population
  each frame. Make sure they are drawn in a grid without
  overlapping each other.
  If an individual has been selected (by the mouse), draw a box
  around it and draw a box around the individual with the
  highest fitness value.
  If mating mode is set to continuous, call mating season.
  ====================================*/
void draw() {
}

/*=====================================
  When the mouse is clicked, set selected to
  the individual clicked on, and set 
  selectedX and selectedY so that a box can be
  drawn around it.
  ====================================*/
void mouseClicked() {
}

/*====================================
  The following keys are mapped to actions:
  
  Right Arrow: move forward one generation
  Up Arrow:    speed up when in continuous mode
  Down Arrow:  slow down when in continuous mode
  Shift:  toggle continuous mode
  Space:  reset the population
  f: toggle fitness value display
  s: toggle smiley display
  m: increase mutation rate
  n: decrease mutation rate
  ==================================*/
void keyPressed() {
  println(keyCode); // displays the integer value of the key pressed
}


/*====================================
  select will return a pseudorandom chromosome from the population
   Uses roulette wheel selection:
     A random number is generated between 0 and the total fitness .
     Go through the population and add each member's fitness until you exceed the random 
     number that was generated.
     Return the individual that the algorithm stopped on.
     Do not include the selected Blob as a possible return value.
  ==================================*/
Individual select() {
  return null;
}

/*====================================
  Replaces the current population with a totally new one by
  selecting pairs of Individuals and mating them.
  Make sure that totalFitness is set before you use select().
  The goal shape (selected) should always be the first Individual
  in the population, unmodified.
  ==================================*/
void matingSeason() {
}

/*====================================
  Randomly call the mutate method on an Individual (or Individuals)
  in the population.
  ==================================*/
void mutate() {
}

/*====================================
  Set the totalFitness to the sum of the fitness values
  of each individual.
  Make sure that each individual has an accurate fitness value.
  ==================================*/
void setTotalFitness() {
}

/*====================================
  Fill the population with randomly generated Individuals.
  Make sure to set the location of each individual such that
  they display nicely in a grid.
  ==================================*/
void populate() {
}

/*====================================
  Go through the population and find the Individual with the 
  highest fitness value.
  Set bestX and bestY so that the best Individual can have a 
  square border drawn around it.
  ==================================*/
void findBest() {
}
       
     
     


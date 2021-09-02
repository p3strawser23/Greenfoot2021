import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int stepCounter;
    public int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 400, 1); 
        this.setBackground("grassyPlains.png");
        Flower f = new Flower();
        Flower f1 = new Flower();
        Flower f2 = new Flower();
        Flower f3 = new Flower();
        Flower f4 = new Flower();
        
        Score s = new Score();
        this.addObject(s, 35, 25);
        
        Timer t = new Timer();
        this.addObject(t, 35, 70);
        
        this.addObject(f,50, 325);
        this.addObject(f1,150, 325);
        this.addObject(f2,250, 325);
        this.addObject(f3, 350, 325);
        this.addObject(f4, 450, 325);
        
        Floor g = new Floor();
        Floor g1 = new Floor();
        Floor g2 = new Floor();
        Floor g3 = new Floor();
        Floor g4 = new Floor();
        Floor g5 = new Floor();
        Floor g6 = new Floor();
        Floor g7 = new Floor();
        Floor g8 = new Floor();
        Floor g9 = new Floor();
        
        this.addObject(g,25, 375);
        this.addObject(g1,75, 375);
        this.addObject(g2,125, 375);
        this.addObject(g3,175, 375);
        this.addObject(g4,225, 375);
        this.addObject(g5,275, 375);
        this.addObject(g6,325, 375);
        this.addObject(g7,375, 375);
        this.addObject(g8,425, 375);
        this.addObject(g9,475, 375);
        
        lives l = new lives();
        this.addObject(l,35,110);
        
        
        
        ladyBug b = new ladyBug();
        this.addObject(b,175, 250);
        
        
    }
    
    public void act()
    {
        this.stepCounter++;
        int worldWidth = this.getWidth();
        int xRand = Greenfoot.getRandomNumber(worldWidth);
        Flower f = new Flower();
        //System.out.println(this.stepCounter);
        Spike j = new Spike();
        if(this.stepCounter % 144 == 0)
        {
            this.addObject(f,xRand, 325);
        }
        if(this.stepCounter % 150 == 0)
        {
            this.addObject(j, xRand, 0);
        }
        
        /*
        if(this.stepCounter % 1000 == 0)
        {
            Greenfoot.stop();
            System.out.prntln("Your score was: " + score);
        }
        */
    }
}

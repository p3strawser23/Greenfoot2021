import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverWorld extends World
{
    private int stepCounter;
    /**
     * Constructor for objects of class gameOverWorld.
     * 
     */
    public gameOverWorld()
    {    
        super(500, 400, 1);
        this.stepCounter=0;
        int worldWidth = this.getWidth();
        int worldHeight = this.getHeight();
        GreenfootImage gfi = new GreenfootImage("gameOverBG.jpg");
        gfi.scale(worldWidth, worldHeight);
        this.setBackground(gfi);
    }
    public void act()
    {
        this.stepCounter++;
        if(stepCounter>=1)
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

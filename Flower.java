import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int turning;
    private int turnedCounter;
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("grayFlower.png");
        gfi.scale( 50, 50 );
        this.setImage( gfi );
        this.turning = 5;
        this.turnedCounter = 0;
    }
    public void act()
    {
        this.turn(this.turning);
        this.turnedCounter+=1;
        //this.getRotation() == 0
        if(this.turnedCounter==144)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
    }
}

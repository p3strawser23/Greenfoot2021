import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Actor
{
    public int heart;
    /**
     * Act - do whatever the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spike()
    {
        GreenfootImage gfi = new GreenfootImage("fallingSpike.png");
        gfi.scale( 50, 50 );
        gfi.rotate(90);
        this.setImage( gfi );
        this.heart=3;
        World w = this.getWorld();
    }
    public void act()
    {
        this.setRotation(90);
        this.move(2);
        if (this.isTouching(Floor.class) == true)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
        else if (this.isTouching(ladyBug.class) == true)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
    }
}

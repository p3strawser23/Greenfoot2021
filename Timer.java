import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Timer()
    {
        GreenfootImage gfi = new GreenfootImage("pxlTimer.png");
        gfi.scale( 40, 40 );
        this.setImage( gfi );
    }
    public void act()
    {
        
    }
}

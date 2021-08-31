import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor extends Actor
{
    public int floorX;
    public int floorY;
    public Floor()
    {
        GreenfootImage gfi = new GreenfootImage("oakPlanks.png");
        gfi.scale( 50, 50 );
        this.setImage( gfi );
    }
    /**
     * Act - do whatever the Floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int floorX = getX();
        int floorY = getY();
    }
}

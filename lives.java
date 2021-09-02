import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lives extends Actor
{
    /**
     * Act - do whatever the lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lives()
    {
        GreenfootImage gfi = new GreenfootImage("pixelHeart.png");
        gfi.scale( 50, 30 );
        this.setImage( gfi );
    }
    public void act()
    {
        // Add your action code here.
    }
}

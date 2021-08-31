import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int turning;
    public Score()
    {
        GreenfootImage gfi = new GreenfootImage("score.png");
        gfi.scale( 75, 40 );
        this.setImage( gfi );
        //this.turning = 5;
    }
    public void act()
    {
        //this.setRotation(0);
        //this.turn(this.turning);
        
    }
}

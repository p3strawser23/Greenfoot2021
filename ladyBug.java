import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ladyBug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ladyBug extends Actor
{
    public int speed;
    public int turning;
    public int score;
    public int upCounter;
    private int stepCounter;
    public int timer;
    public ladyBug ()
    {
        this.speed=2;
        this.turning=0;
        this.score=0;
        this.upCounter=0;
        this.timer=0;
    }
    /**
     * Act - do whatever the ladyBug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int turningRand = Greenfoot.getRandomNumber(360);
        if(Greenfoot.isKeyDown("up") == true && upCounter==0)
        {
            this.setRotation(270);
            this.move(30);
            this.upCounter=1;
        }
        else if(Greenfoot.isKeyDown("down") == true)
        {
            this.setRotation(90);
            this.move(speed);
        }
        else if(Greenfoot.isKeyDown("left") == true)
        {
            this.setRotation(180);
            this.move(speed);
        }
        else if(Greenfoot.isKeyDown("right") == true)
        {
            this.setRotation(0);
            this.move(speed);
        }
        if (this.isTouching(Flower.class) == true)
        {
            World w = this.getWorld();
            this.removeTouching(Flower.class);
            this.score++;
            w.showText("" + score, 80, 25);
        }
        if (this.isTouching(Floor.class) == true)
        {
            this.setRotation(270);
            this.move(5);
            this.upCounter = 0;
        }
        if(this.stepCounter % 10 == 0)
        {
            this.timer+=1;
            World w = this.getWorld();
            w.showText("" + timer, 80, 70);
        }
        /*
        else if(upCounter == 1)
        {
            do{
            this.turnTowards(floorX, floorY);
            this.move(3);
            }while(this.isTouching(Floor.class) == false);
        }
        */
        /*
        if (this.isAtEdge() == true) //double equal signs test for equality
        {
            //this.turn(turningRand);
        }
        */
        
        
    }
}

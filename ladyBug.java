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
    public int heart;
    public int fireCounter;
    public int stepFireCounter;
    public ladyBug ()
    {
        this.speed=3;
        this.turning=0;
        this.score=0;
        this.upCounter=0;
        this.timer=0;
        this.heart=3;
        this.fireCounter=0; 
        this.stepFireCounter=0;
    }
    /**
     * Act - do whatever the ladyBug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int turningRand = Greenfoot.getRandomNumber(360);
        World w = this.getWorld();
        // && upCounter==0
        this.stepFireCounter+=1;
        int shipX = getX();
        int shipY = getY();
        /*
        int worldWidth = w.getWidth();
        int worldHeight = w.getHeight();
        GreenfootImage gfi = new GreenfootImage("gameOverBG.jpg");
        gfi.scale(worldWidth, worldHeight);
        */
        if(Greenfoot.isKeyDown("up") == true)
        {
            this.setRotation(270);
            this.move(speed);
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
            this.removeTouching(Flower.class);
            this.score+=10;
            w.showText("" + score, 85, 25);
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
            w.showText("" + timer, 80, 70);
        }
        if (this.isTouching(Spike.class) == true)
        {
            this.heart-=1;
            if(this.heart==0)
            {
                //GreenfootImage gfi = new GreenfootImage("gameOver.jpg");
                //gfi.scale(85, 48);
                //w.setBackground(gfi);
                Greenfoot.setWorld(new gameOverWorld());
                Greenfoot.stop();
            }
        }
        if(this.stepFireCounter==50)
        {
            fireCounter=0;
            stepFireCounter=0;
        }
        if( Greenfoot.isKeyDown("space") == true && fireCounter==0)
        {
            getWorld().addObject(new Laser(), shipX, shipY);
            fireCounter=1;
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
        w.showText("" + heart, 80, 110);
    }
}

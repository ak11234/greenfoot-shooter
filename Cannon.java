import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author Adam K 
 * @version Versioned via git: https://github.com/ak11234/greenfoot-shooter
 */
public class Cannon extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnCannon();
        fire();
    }

    /**
     * 
     */
    public void turnCannon()
    {
        if (Greenfoot.isKeyDown("left")) {
            setRotation(getRotation()-2);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(getRotation()+2);
        }
    }

    /**
     * Shoot a cannon ball
     */
    public void fire()
    {
        CannonBall ball = new CannonBall();
    }
}

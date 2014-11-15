import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonBall extends Cannon
{
    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fly();
        explodeOnWall();
    }
    
    public void fly()
    {
        move(5);
    }
    
    public void explodeOnWall()
    {
        if (getX() == getWorld().getWidth()-1 || getX() == 0){
            getWorld().removeObject(this);
        }
        else if (getY() == getWorld().getHeight()-1 || getY() == 0){
            getWorld().removeObject(this);
        }
    }
}

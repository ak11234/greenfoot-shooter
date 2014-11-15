import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class Cannon here.
 * 
 * @author Adam K 
 * @version Versioned via git: https://github.com/ak11234/greenfoot-shooter
 */
public class Cannon extends Actor
{
    Toolkit toolkit;
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnCannon();
        fire();
    }

    public boolean isCapsLockOn()
    {
        toolkit = Toolkit.getDefaultToolkit();
        return toolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
    }

    /**
     * Turn the cannon
     */
    public void turnCannon()
    {
        if (isCapsLockOn()){

            if (Greenfoot.isKeyDown("left")) {
                setRotation(getRotation()-5);
            }
            if (Greenfoot.isKeyDown("right")) {
                setRotation(getRotation()+5);
            }
        }else{
            if (Greenfoot.isKeyDown("left")) {
                setRotation(getRotation()-3);
            }
            if (Greenfoot.isKeyDown("right")) {
                setRotation(getRotation()+3);
            }
        }
    }

    /**
     * Shoot a cannon ball
     */
    public void fire()
    {
        if (Greenfoot.isKeyDown("space")){
            CannonBall ball = new CannonBall();
            ball.setRotation(getRotation()-90);
            getWorld().addObject(ball, getX(), getY());
            Greenfoot.delay(10);
        }
    }
}
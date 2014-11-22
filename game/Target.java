import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    int dir = 0;
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        go();
    }

    public void go()
    {
        if (getX() == getWorld().getWidth()-1){
            dir = 1;
        }
        else if (getX() == 0){
            dir = 2;
        }

        if (dir == 0 || dir == 1){
            move(-3);
        }
        else if (dir == 2){
            move(3);
        }
    }
}

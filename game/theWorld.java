import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class theWorld extends World
{
    private Counter counter;
    /**
     * Constructor for objects of class theWorld.
     * 
     */
    public theWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Cannon cannon = new Cannon();
        addObject(cannon, 300, 350);
        counter = new Counter();
        addObject(counter, 67, 372);
        Target target = new Target();
        addObject(target, 133, 139);
        Target target2 = new Target();
        addObject(target2, 453, 135);
        target2.setLocation(448, 59);
        target.setLocation(142, 182);
    }

    public Counter getCounter()
    {
        return counter;
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int time;
    batman bat = new batman();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 900, 1); 
        spaceship space = new spaceship();
        addObject(space,550,200);
        batman bat = new batman();
        addObject(bat,550,800);
        
        time = 1000;
        showTime();

    }
    public void act()
    {
        
        countTime();
        
        if ((time <= 0)&& (bat != null))
        {
         win w = new win();
         addObject(w, 500,500); 
         Greenfoot.stop();
        }
    }
    private void countTime()
    {
        time--;
        showTime();
       
        
    }
    
    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }
    
    
}

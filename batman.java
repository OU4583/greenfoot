import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trav here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class batman extends Actor

{
    private int velocity = 10;
    private int stability;

    /**
     * Act - do whatever the Trav wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x,y - velocity);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x,y + velocity);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-velocity , y);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + velocity , y );
        }
        if(isTouching(spaceship.class))
        {
             MyWorld myworld = (MyWorld)getWorld();
                youlose ylose = new youlose();
                myworld.addObject(ylose, 500,500); 
            getWorld().removeObject(this);
            Greenfoot.stop();
            
        }
        if(isTouching(money.class)){
                MyWorld myworld = (MyWorld)getWorld();
                youlose ylose = new youlose();
                myworld.addObject(ylose, 500,500); 
                getWorld().removeObject(this);
                Greenfoot.stop();
                
                
                
    
         }
    }
}
    
       
        
        

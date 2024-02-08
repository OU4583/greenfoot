import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class money extends Actor
{
    private int velocity = 2;
    private int speed = 1;
    private static final int damage = 16;
    private int life = 30;
    public void act()
    {
        int x = getX();
        int y = getY();

       if(isAtEdge()){
            getWorld().removeObject(this);
        }

        else{
            
            
          velocity = velocity + speed;
          setLocation(x, y + velocity);
        }
        
       if(life <= 0) {
           getWorld().removeObject(this);
        }
        else{
            life --;
            int move;
            
       
       
        }
        
    }
    
    
   
    }

            
            
    
    
   


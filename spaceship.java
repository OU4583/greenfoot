import greenfoot.*;

public class spaceship extends Actor
   {

    private boolean walkingRight = true;

    
    public void act() 
    {

        if(walkingRight == true){
            move(5);
            if(isAtEdge()){
                walkingRight = false;
            }
        }
        else {
            move(-5);
            if (isAtEdge()) {
                walkingRight = true;
            }
        }
        
        double random = Math.random();
        if( random <= .05){
            getWorld().addObject(new money(), getX(), getY());
        }   
        
        
    }
   
}

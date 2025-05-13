import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Clark
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, 270, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,486,92);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,285,360);
        label.setLocation(315,351);
        Label label2 = new Label("Use \u2190 and \u2192  to Move", 40);
        addObject(label2,273,247);
        label2.setLocation(244,213);
        label2.setLocation(280,212);
        label2.setLocation(284,205);
        label.setLocation(288,300);
        
    }
}

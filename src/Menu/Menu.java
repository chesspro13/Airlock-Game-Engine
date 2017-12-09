/*
 * Menu class to handle all of the menu opperations
 */
package Menu;
import airlockgameengine.GameEngine;

/**
 *
 * @author Brandon
 */
public class Menu {
    
    private GameEngine airlockGameEngineInstance;
    
    public Menu( GameEngine airlockGameEngineInstance )
    {
        this.airlockGameEngineInstance = airlockGameEngineInstance;
    }
    
    public Menu generateMenu( MenuType menuType )
    {
        switch( menuType )
        {
            case MainMenu:
                System.out.println("This is the main menu!");
                break;
        }
        
        return null;
    }
    
}

/*
 * This class handles all of the things.
 */
package airlockgameengine;
import RenderingEngine.*;
import Menu.Menu;
import GameEvent.GameEvent;
import Menu.MenuType;

/**
 * @author Brandon
 */
public class GameEngine {
   
    private boolean gameIsRunning;
    private GameState lastGameState;
    private GameState gameState;
    private Menu menuObject;
    
    private GameEvent gameEvent;
    
    public GameEngine()
    {
        System.out.println("Game Engine Started");
        initializeGameEngine();
        gameLoop();
    }
    
    private void initializeGameEngine()
    {
        gameState = GameState.splash;
        gameIsRunning = true;
    }
    
    private void gameLoop()
    {
        while( gameIsRunning )
        {
            switch( gameState )
            {
                case splash:
                    //TODO: Create threads to handle running background initializing while displaying a splash screen.
                    System.out.println("This is the splash screen.");
                    new GameEvent( this ).changeState( gameState.menu );
                    break;
                case menu:
                    this.menuObject = new Menu( this ).generateMenu( MenuType.MainMenu );
                    gameIsRunning = false;
                    break;
            }
        }
    }
    
    public void setGameState( GameState newGameState )
    {
        this.lastGameState = this.gameState;
        this.gameState = newGameState;
    }
    
}

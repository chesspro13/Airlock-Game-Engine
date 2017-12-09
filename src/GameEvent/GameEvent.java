/*
 * Handles game events
 */
package GameEvent;
import airlockgameengine.*;

/**
 *
 * @author Brandon
 */
public class GameEvent {
    private GameEngine gameEngineInstance;
    
    public GameEvent( GameEngine gameEngineInstance )
    {
        this.gameEngineInstance = gameEngineInstance;
    }
    
    public void changeState( GameState newState )
    {
        gameEngineInstance.setGameState( newState );
    }
}

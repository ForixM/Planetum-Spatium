package ma.forix.main.game;

import ma.forix.main.game.level.Level;

public class Game {

    Level level;

    public Game(){
        level = new Level(10, 10);
    }

    public void init(){
        level.init();
    }

    public void update(){
        level.update();
    }

    public void render(){
        level.render();
    }
}

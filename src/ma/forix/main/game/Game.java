package ma.forix.main.game;

import ma.forix.main.game.level.Level;
import org.lwjgl.opengl.GL11;

public class Game {

    Level level;

    public static float xScroll, yScroll;

    public Game(){
        level = new Level(64, 64);
    }

    public void init(){
        level.init();
    }

    public void translateView(float xa, float ya){
        xScroll+=xa;
        yScroll+=ya;
    }

    public void update(){
        level.update();
    }

    public void render(){
        GL11.glTranslatef(xScroll, yScroll, 0);
        level.render();
    }
}

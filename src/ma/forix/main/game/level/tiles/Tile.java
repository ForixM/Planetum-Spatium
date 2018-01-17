package ma.forix.main.game.level.tiles;

import ma.forix.main.Component;
import ma.forix.main.game.Game;
import ma.forix.main.graphics.Renderer;

import java.util.Random;

public class Tile {

    public int x, y;
    public int size = 16;

    float[] color;

    Random random = new Random();

    public enum Tiles{
        GRASS, ROCK, WATER
    }

    public Tile(int x, int y){
        this.x = x;
        this.y = y;

        color = new float[]{random.nextFloat(), random.nextFloat(), random.nextFloat(), 1.0f};
    }

    public void render(){
        float x0 = x + Game.xScroll/16;
        float y0 = y + Game.yScroll/16;

        float x1 = x + 1 + Game.xScroll/16;
        float y1 = y + 1 + Game.yScroll/16;

        if (x1 < 0 || y1 < 0 || x0 > Component.width/15 || y0 > Component.height/15) return;
        Renderer.renderQuad(x*size, y*size, size, size, color);
    }
}

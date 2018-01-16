package ma.forix.main.game;


import ma.forix.main.Component;
import ma.forix.main.graphics.Renderer;

public class Game {
    public Game(){

    }

    public void init(){

    }

    public void update(){

    }

    public void render(){
        for (int x = 0; x < Component.width/16; x++){
            for (int y = 0; y < Component.height/16; y++){
                Renderer.renderQuad(x*17, y*17, 16, 16, new float[]{0, 1, 0, 1});
            }
        }
    }
}

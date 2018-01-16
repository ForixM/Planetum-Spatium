package ma.forix.main.graphics;

import static org.lwjgl.opengl.GL11.*;

public class Renderer {
    public static void quadData(int x, int y, int w, int h, float[] color){
        glVertex2f(x, y);
        glVertex2f(x+w, y);
        glVertex2f(x+w, y+h);
        glVertex2f(x, y+h);
    }

    public static void renderQuad(int x, int y, int w, int h){
        glBegin(GL_QUADS);
            Renderer.quadData(x, y, w, h);
        glEnd();
    }
}

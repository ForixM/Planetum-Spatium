package ma.forix.main;

import ma.forix.main.graphics.Renderer;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.util.glu.GLU;

import static org.lwjgl.opengl.GL11.*;

public class Component {

    public boolean running = false;

    public static String title="Planetum Spatium";
    public static int scale=3;
    public static int width=735 / scale;
    public static int height=575 / scale;

    int time = 0;

    public static boolean tick = false;
    public static boolean render = false;

    DisplayMode mode = new DisplayMode(width*scale, height*scale);

    public Component(){
        try {
            Display.setDisplayMode(mode);
            Display.setResizable(true);
            Display.setFullscreen(false);
            Display.setTitle(title);
            Display.create();

            view2D(width, height);
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }

    private void view2D(int width, int height){
        glViewport(0, 0, width*scale, height*scale);

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        GLU.gluOrtho2D(0, width, height, 0);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
    }

    public void start(){
        running = true;
        loop();
    }

    public void stop(){
        running = false;
    }

    public void loop(){
        long timer = System.currentTimeMillis();

        long before = System.nanoTime();
        double elapsed = 0;
        double nanosecond = 1000000000.0 / 60.0;

        int ticks = 0;
        int frames = 0;

        while(running){
            if (Display.isCloseRequested()) stop();
            Display.update();
            width = Display.getWidth()/scale;
            height = Display.getHeight()/scale;

            tick = false;
            render = false;

            long now = System.nanoTime();
            elapsed = now-before;

            if (elapsed > nanosecond){
                before += nanosecond;
                tick = true;
                ticks++;
            }else{
                render = true;
                frames++;
            }

            if (tick) update();
            if (render) render();

            if (System.currentTimeMillis() - timer > 1000){
                timer+=1000;
                Display.setTitle(title+", "+"ticks: "+ticks+", fps: "+frames);
                ticks=0;
                frames=0;
            }
        }
        exit();
    }

    public void update(){
        time++;
    }

    public void render(){
        view2D(width, height);
        glClear(GL_COLOR_BUFFER_BIT);
        Renderer.renderQuad(50, 50, 16, 16);
    }

    public void exit(){
        Display.destroy();
        System.exit(0);
    }

    public static void main(String[] args){
        Component main = new Component();
        main.start();
    }
}

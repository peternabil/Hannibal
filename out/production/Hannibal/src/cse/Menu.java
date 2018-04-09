package cse;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import javax.swing.*;

public class Menu extends BasicGameState{
    Image startgame;
    Image exitgame;
    public Menu(int state){

//        SpriteSheet s = new SpriteSheet("res/LPC_Ancient_Greece_Architecture.png",100,100,10);
    }
    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        startgame = new Image("res/button_1.PNG");
        exitgame = new Image("res/button_1 copy.PNG");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(new Image("forest/1.png"),0,500);
        g.drawImage(new Image("forest/2.png"),0,500);
        g.drawImage(new Image("forest/3.png"),0,500);
        g.drawImage(new Image("forest/4.png"),0,500);
        g.drawImage(new Image("forest/1.png"),272,500);
        g.drawImage(new Image("forest/2.png"),272,500);
        g.drawImage(new Image("forest/3.png"),272,500);
        g.drawImage(new Image("forest/4.png"),272,500);
        g.drawImage(new Image("forest/1.png"),2*272,500);
        g.drawImage(new Image("forest/2.png"),2*272,500);
        g.drawImage(new Image("forest/3.png"),2*272,500);
        g.drawImage(new Image("forest/4.png"),2*272,500);
        g.setColor(Color.yellow);
        g.drawString("Are You Ready Roman ?",300,200);
        startgame.draw(400-(128/2),300-16);
        exitgame.draw(400-(128/2),400-16);
    }
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i ) throws SlickException {
        int x = Mouse.getX();
        int y = 800 - Mouse.getY();
        if ((x>400-(128/2) && x<400+(128/2))&&(y>300-16 && y<300+16))
            if (Mouse.isButtonDown(0))
                sbg.enterState(1);
        if ((x>400-(128/2) && x<400+(128/2))&&(y>400-16 && y<400+16))
            if (Mouse.isButtonDown(0))
                System.exit(0);
    }
}

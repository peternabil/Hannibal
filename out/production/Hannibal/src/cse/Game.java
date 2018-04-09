package cse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
public class Game extends StateBasedGame{
    public static final String nameofgame = "Hannibal The Great";
    public static final int menu = 0;
    public static final int play = 1;

    public Game(String nameofgame) {
        super(nameofgame);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try {
            appgc = new AppGameContainer(new Game(nameofgame));
            appgc.setDisplayMode(800,800,false);
//            appgc.setFullscreen(true);
            appgc.setShowFPS(false);
            appgc.setIcon("res/roman/attack e0000.bmp");
            appgc.start();
        }catch (SlickException e){
            e.printStackTrace();
        }
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(menu).init(gc,this);
        this.getState(play).init(gc,this);
        this.enterState(menu);
    }
}

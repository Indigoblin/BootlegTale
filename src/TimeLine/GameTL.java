package TimeLine;

import Controller.ControllerKeyboard;
import View.ViewGame;
import javafx.animation.AnimationTimer;

public class GameTL extends AnimationTimer {
    private final ControllerKeyboard controllerKeyboard;


    public GameTL(ControllerKeyboard controllerKeyboard){
        this.controllerKeyboard = controllerKeyboard;
        this.start();
    }

    @Override
    public void handle(long now) {
        if (controllerKeyboard.isUpPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.up);
            controllerKeyboard.getLauncher().getvGame().checkPosition();
        }
        if(controllerKeyboard.isLeftPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.left);
            controllerKeyboard.getLauncher().getvGame().checkPosition();
        }
        if(controllerKeyboard.isRightPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.right);
            controllerKeyboard.getLauncher().getvGame().checkPosition();
        }
        if(controllerKeyboard.isDownPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.down);
            controllerKeyboard.getLauncher().getvGame().checkPosition();
        }
    }
}

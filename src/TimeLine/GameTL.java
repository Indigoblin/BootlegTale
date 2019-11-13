package TimeLine;

import Controller.ControllerKeyboard;
import Model.Joueur;
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
        }
        if(controllerKeyboard.isLeftPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.left);
        }
        if(controllerKeyboard.isRightPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.right);
        }
        if(controllerKeyboard.isDownPressed()){
            controllerKeyboard.getLauncher().getvGame().move(ViewGame.down);
        }
    }
}

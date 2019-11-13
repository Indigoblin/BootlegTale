package TimeLine;

import Controller.ControllerKeyboard;
import Model.Joueur;
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
            controllerKeyboard.getLauncher().getvGame().getPlayer().move(Joueur.up);
        }
        if(controllerKeyboard.isLeftPressed()){
            controllerKeyboard.getLauncher().getvGame().getPlayer().move(Joueur.left);
        }
        if(controllerKeyboard.isRightPressed()){
            controllerKeyboard.getLauncher().getvGame().getPlayer().move(Joueur.right);
        }
        if(controllerKeyboard.isDownPressed()){
            controllerKeyboard.getLauncher().getvGame().getPlayer().move(Joueur.down);
        }
    }
}

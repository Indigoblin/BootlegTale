package Controller;

import Model.ModelGame;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerGame implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelGame model;

    public ControllerGame(ViewHandler viewHandler, ModelGame model) {
        this.model = model;
        this.launcher = viewHandler;
        this.launcher.setEventHandlerGame(this);
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getvGame().getBtnBackMainP())) {
            launcher.setMenuView();
        }
    }

}

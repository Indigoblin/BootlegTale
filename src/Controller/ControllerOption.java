package Controller;

import Model.ModelOption;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerOption implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelOption model;

    public ControllerOption(ViewHandler viewHandler, ModelOption model){
        this.model = model;
        this.launcher = viewHandler;
        this.launcher.setEventHandlerOption(this);

    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getvOption().getBtnBackMainP2())) {
            launcher.setMenuView();
        }
    }
}

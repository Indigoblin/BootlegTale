package View;

import Controller.ControllerGame;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class ViewGame {
    private Group root;
    private Button btnBackMainP;
    private ViewHandler vhGame;


    public ViewGame(ViewHandler vhGame, Group root) {
        this.vhGame = vhGame;
        this.root = root;
        btnBackMainP = initButton(150,120,"Back");

    }

    void initView() {

        root.getChildren().clear();
        root.getChildren().add(btnBackMainP);
    }

    private Button initButton(int longeur, int largeur, String texteDuBouton) {
        Button b = new Button();
        b.setLayoutX(longeur);
        b.setLayoutY(largeur);
        b.setText(texteDuBouton);
        return b;
    }

    public void setEventsBack(ControllerGame mc) {
        btnBackMainP.setOnMouseClicked(mc);
    }

    public Button getBtnBackMainP() {
        return btnBackMainP;
    }
}

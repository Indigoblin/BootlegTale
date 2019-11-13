package View;

import Controller.ControllerGame;
import Model.Joueur;
import Controller.ControllerKeyboard;
import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ViewGame {
    private Group root;
    private Button btnBackMainP;
    private ViewHandler vhGame;
    private Font fontScreenText;
    private ControllerKeyboard keyListen;
    private Joueur player;


    public ViewGame(ViewHandler vhGame, Group root) {
        this.vhGame = vhGame;
        this.root = root;
        keyListen = new ControllerKeyboard(root);
        btnBackMainP = initButton(940,750,"Back");
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
        b.setBackground(null);
        fontScreenText = Font.loadFont(getClass().getResourceAsStream(Path.fontDTMSans), 60);
        b.setFont(fontScreenText);
        b.setTextFill(Color.WHITE);
        return b;
    }

    public void setEventsBack(ControllerGame mc) {
        btnBackMainP.setOnMouseClicked(mc);
    }

    public Button getBtnBackMainP() {
        return btnBackMainP;
    }

    public void setEvents(ControllerKeyboard kl){
        root.getScene().setOnKeyPressed(kl);
        root.getScene().setOnKeyReleased(kl);
    }
}

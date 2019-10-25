package View;

import Controller.ControllerOption;
import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ViewOption {
    private Group root;
    private Button btnBackMainP2;
    private ViewHandler vhOption;
    private Text screenTextMenu, screenTextBackMenu;
    private Font fontScreenTextMenu, fontScreenTextBackMenu;

    public ViewOption(ViewHandler vhOption, Group root){
        this.vhOption = vhOption;
        this.root = root;
        initTitle();

        btnBackMainP2 = initButton(250,420,"Back");

    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(screenTextBackMenu);
        root.getChildren().add(screenTextMenu);
        root.getChildren().add(btnBackMainP2);
    }

    private Button initButton(int longeur, int largeur, String texteDuBouton) {
        Button b = new Button();
        b.setLayoutX(longeur);
        b.setLayoutY(largeur);
        b.setText(texteDuBouton);
        return b;
    }

    private Text titleScreen(String ecranTitre, int longueur, int largeur){
        Text t = new Text();
        t.setText(ecranTitre);
        t.setLayoutX(longueur);
        t.setLayoutY(largeur);
        return t;
    }

    private void initTitle(){
        screenTextBackMenu = new Text();
        screenTextBackMenu = titleScreen("Options",200,150);
        fontScreenTextBackMenu = Font.loadFont(getClass().getResourceAsStream(Path.monsterFriendBack), 80);
        screenTextBackMenu.setFont(fontScreenTextBackMenu);
        screenTextBackMenu.setFill(Color.GRAY);
        screenTextMenu = new Text();
        screenTextMenu = titleScreen("Options",200,150);
        fontScreenTextMenu = Font.loadFont(getClass().getResourceAsStream(Path.monsterFriendFore), 80);
        screenTextMenu.setFont(fontScreenTextMenu);
        screenTextMenu.setFill(Color.WHITE);
    }

    public void setEventsBack(ControllerOption cm){
        btnBackMainP2.setOnMouseClicked(cm);
    }

    public Button getBtnBackMainP2() {
        return btnBackMainP2;
    }
}

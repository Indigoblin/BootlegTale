package View;

import Controller.ControllerMenu;
import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class ViewMainMenu {
    private ViewHandler vhMenu;
    private Button btnStart, btnOption, btnQuit;
    private Group root;
    private Text screenText;
    private Text screenTextBack;
    private Font fontScreenText, fontScreenTextBack;

    ViewMainMenu(ViewHandler vhMenu, Group root){
        this.vhMenu = vhMenu;
        this.root = root;

        // initialisation des boutons
        btnStart = initButton(150, 220, "Start");
        btnOption = initButton(150, 320, "Options");
        btnQuit = initButton(150,420,"Quit");

        initTitle();
        initView();

    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(btnStart);
        root.getChildren().add(btnOption);
        root.getChildren().add(btnQuit);
        root.getChildren().add(screenTextBack);
        root.getChildren().add(screenText);

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
        screenTextBack = new Text();
        screenTextBack = titleScreen("BootlegTale",200,150);
        fontScreenTextBack = Font.loadFont(getClass().getResourceAsStream(Path.monsterFriendBack), 80);
        screenTextBack.setFont(fontScreenTextBack);
        screenTextBack.setFill(Color.GRAY);
        screenText = new Text();
        screenText = titleScreen("BootlegTale",200,150);
        fontScreenText = Font.loadFont(getClass().getResourceAsStream(Path.monsterFriendFore), 80);
        screenText.setFont(fontScreenText);
        screenText.setFill(Color.WHITE);
    }

    public void setEvents(ControllerMenu mc) {
        btnStart.setOnMouseClicked(mc);
        btnOption.setOnMouseClicked(mc);
        btnQuit.setOnMouseClicked(mc);
    }

    public Button getBtnStart() {
        return btnStart;
    }

    public Button getBtnOption() {
        return btnOption;
    }

    public Button getBtnQuit() {
        return btnQuit;
    }
}
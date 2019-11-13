package View;

import Controller.ControllerOption;
import Toolbox.Music;
import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ViewOption {
    private Group root;
    private Button btnBackMainP2, btnProfil, btnSave, btnLoad, btnSoundControl;
    private ViewHandler vhOption;
    private Text screenTextMenu, screenTextBackMenu;
    private Font fontScreenTextMenu, fontScreenTextBackMenu;
    private Font fontScreenText;
    private Slider musicSlider;

    ViewOption(ViewHandler vhOption, Group root){
        this.vhOption = vhOption;
        this.root = root;
        initTitle();
        btnVolume(400,610);

        btnBackMainP2 = initButton(940,750,"Back");
        btnProfil = initButton(150,280,"Profil");
        btnLoad = initButton(150,380,"Charger une partie");
        btnSave = initButton(150,480,"Sauvegarder la partie");
        btnSoundControl = initButton(150,580,"Volume");
    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(screenTextBackMenu);
        root.getChildren().add(screenTextMenu);
        root.getChildren().add(btnBackMainP2);
        root.getChildren().add(btnProfil);
        root.getChildren().add(btnLoad);
        root.getChildren().add(btnSave);
        root.getChildren().add(btnSoundControl);
        root.getChildren().add(musicSlider);
        root.getStylesheets().add(getClass().getResource("../Asset/css/slider.css").toExternalForm());
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

    private void btnVolume(int largeur, int longueur){
        musicSlider= new Slider(0,100,100);
        musicSlider.setBlockIncrement(10);
        musicSlider.setShowTickLabels(true);
        musicSlider.valueProperty().addListener((observable, oldValue, newValue) -> Music.setVolume(newValue.intValue() / 100.));
        musicSlider.setLayoutX(largeur);
        musicSlider.setLayoutY(longueur);
    }


    public void setEventsBack(ControllerOption cm){
        btnBackMainP2.setOnMouseClicked(cm);
    }

    public Button getBtnBackMainP2() {
        return btnBackMainP2;
    }
}

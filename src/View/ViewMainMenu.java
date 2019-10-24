package View;

import Toolbox.Path;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ViewMainMenu {
    private Stage primaryStage;
    private Button btnStart, btnOption, btnQuit, btnBackMainP, btnBackMainP2;
    private Scene scene, scene2, scene3;
    private Group root, root2, root3;
    private Text screenText;
    private Text screenTextBack;
    private Font fontScreenText, fontScreenTextBack;

    ViewMainMenu(Stage primaryStage, Group root/*, Group root2, Group root3*/){
        this.primaryStage = primaryStage;
        //scene.setCursor(Cursor.NONE);
        this.root = root;
        //this.root2 = root2;
        //this.root3 = root3;

        // initialisation des boutons
        btnStart = initButton(150, 220, "Start");
        btnOption = initButton(150, 320, "Options");
        btnQuit = initButton(150,420,"Quit");
        //btnBackMainP = initButton(150,120,"Back");
        //btnBackMainP2 = initButton(250,420,"Back");

        // action des boutons
        btnStart.setOnAction(event -> primaryStage.setScene(scene));
        btnOption.setOnAction(event -> primaryStage.setScene(scene2));
        btnQuit.setOnAction(event -> primaryStage.close());
        //btnBackMainP.setOnAction(event -> primaryStage.setScene(scene));
        //btnBackMainP2.setOnAction(event -> primaryStage.setScene(scene));

        initTitle();
        setVueMainMenu();

    }

    void setVueMainMenu(){
        root.getChildren().clear();
        root.getChildren().add(btnStart);
        root.getChildren().add(btnOption);
        root.getChildren().add(btnQuit);
        root.getChildren().add(screenTextBack);
        root.getChildren().add(screenText);
        //root2.getChildren().add(btnBackMainP2);
        //root3.getChildren().add(btnBackMainP);
    }

    private Button initButton(int longeur, int largeur, String texteDuBouton) {

        // Création d'un bouton
        Button b = new Button();
        b.setLayoutX(longeur);
        b.setLayoutY(largeur);
        b.setText(texteDuBouton);
        return b;
    }

    private Text titleScreen(String ecranTitre, int longueur, int largeur){

        // Création d'un titre
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

}
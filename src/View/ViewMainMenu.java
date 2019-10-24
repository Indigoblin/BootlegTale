package View;

import Toolbox.Music;
import Toolbox.Path;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ViewMainMenu extends Application {
    private Stage primaryStage;
    private Button btn, btn2, btn3, btn4, btn5;
    private Scene scene, scene2, scene3;
    private Group root, root2, root3;
    private Text screenText;
    private Text screenTextBack;
    private Font fontScreenText, fontScreenTextBack;

    public static void main(String[] args) {
        Application.launch(ViewMainMenu.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("BootlegTale");

        root = new Group();
        root2 = new Group();
        root3 = new Group();
        scene = new Scene(root, 1200, 900, Color.BLACK);
        scene2 = new Scene(root2, 1200, 900, Color.BLACK);
        scene3 = new Scene(root3, 1200, 900, Color.BLACK);

        // initialisation des boutons
        btn = initButton(150, 220, "Start");
        btn2 = initButton(150, 320, "Options");
        btn3 = initButton(150,420,"Quit");
        btn4 = initButton(150,120,"Back");
        btn5 = initButton(250,420,"Back");

        // titre écran
        screenText = new Text();
        screenText = titleScreen("BootlegTale",200,150);
        fontScreenText = Font.loadFont(getClass().getResourceAsStream(Path.monsterFriendFore), 80);
        screenText.setFont(fontScreenText);
        screenText.setFill(Color.WHITE);
        screenTextBack = new Text();
        screenTextBack = titleScreen("BootlegTale",200,150);
        fontScreenTextBack = Font.loadFont(getClass().getResourceAsStream(Path.monsterFriendBack), 80);
        screenTextBack.setFont(fontScreenTextBack);
        screenTextBack.setFill(Color.WHITE);

        // action des boutons
        btn.setOnAction(event -> primaryStage.setScene(scene2));
        btn2.setOnAction(event -> primaryStage.setScene(scene3));
        btn3.setOnAction(event -> primaryStage.close());
        btn4.setOnAction(event -> primaryStage.setScene(scene));
        btn5.setOnAction(event -> primaryStage.setScene(scene));


        Music.startMainMenuMusic();

        // composition des scènes
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(screenText);
        root.getChildren().add(screenTextBack);
        root2.getChildren().add(btn5);
        root3.getChildren().add(btn4);


        // gestion de l'affichage au lancement
        primaryStage.setScene(scene);
        //primaryStage.setFullScreen(true);
        primaryStage.show();

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

}
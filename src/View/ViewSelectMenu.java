package View;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ViewSelectMenu {
    private Stage primaryStageSelect;
    private Button btnBackMainP;
    private Scene scene, scene3;
    private Group root3;

    ViewSelectMenu(Stage primaryStageSelect, Group root3){
        this.primaryStageSelect = primaryStageSelect;
        this.root3 = root3;

        // initialisation des boutons

        btnBackMainP = initButton(150,120,"Back");
        btnBackMainP.setOnAction(event -> primaryStageSelect.setScene(scene));

        setVueSelectMenu();
    }

    void setVueSelectMenu(){
        root3.getChildren().clear();
        root3.getChildren().add(btnBackMainP);
    }

    private Button initButton(int longeur, int largeur, String texteDuBouton) {

        // Création d'un bouton
        Button b = new Button();
        b.setLayoutX(longeur);
        b.setLayoutY(largeur);
        b.setText(texteDuBouton);
        return b;
    }

}

package View;

//import Controller.ControllerMenuPrin;
import Toolbox.Music;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private Stage primaryStageSelect;
    private Scene scene, scene2, scene3;
    private Group root, root2, root3;
    private ViewMainMenu viewMenuPrinc;
    private ViewSelectMenu viewSelectMenu;


    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        root = new Group();
        root2 = new Group();
        scene = new Scene(root, 1200, 900, Color.BLACK);
        scene2 = new Scene(root2, 1200, 900, Color.BLACK);

        viewMenuPrinc = new ViewMainMenu(primaryStage,root/*,root2,root3*/);

        Music.startMainMenuMusic();
        primaryStage.setTitle("BootlegTale");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public ViewMainMenu getviewMenuPrinc() {
        return viewMenuPrinc;
    }

    public void setPrimaryStage(Stage primaryStageSelect){
        this.primaryStageSelect = primaryStageSelect;
        root3 = new Group();
        scene3 = new Scene(root3, 1200, 900, Color.BLACK);

        viewSelectMenu = new ViewSelectMenu(primaryStageSelect,root3);

        primaryStageSelect.setScene(scene3);
        primaryStageSelect.setResizable(false);
        primaryStageSelect.show();

    }

    public Stage getPrimaryStageSelect(){
        return primaryStageSelect;
    }
    public ViewSelectMenu getviewSelectMenu(){
        return getviewSelectMenu();
    }


}

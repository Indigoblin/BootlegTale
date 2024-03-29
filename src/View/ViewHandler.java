package View;

import Controller.ControllerGame;
import Controller.ControllerMenu;
import Controller.ControllerOption;
import Model.Joueur;
import Model.ModelGame;
import Model.ModelMenu;
import Model.ModelOption;
import Controller.ControllerKeyboard;
import Toolbox.Music;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene;
    private Group root;
    private ViewMainMenu vMenu;
    private ViewGame vGame;
    private ViewOption vOption;
    private ModelMenu modelMenu;
    private ModelGame modelGame;
    private ModelOption modelOption;
    private ControllerKeyboard keyListen;
    private ControllerMenu controllerMenu;
    private ControllerGame controllerGame;
    private ControllerOption controllerOption;
    private Joueur player;

    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        root = new Group();
        scene = new Scene(root, 1200, 900, Color.BLACK);

        modelMenu = new ModelMenu();
        modelGame = new ModelGame();
        modelOption = new ModelOption();
        player = new Joueur();
        vMenu = new ViewMainMenu(this,root);
        vGame = new ViewGame(this,root,player);
        vOption = new ViewOption(this,root);
        controllerMenu = new ControllerMenu(this, modelMenu);
        controllerGame = new ControllerGame(this, modelGame);
        controllerOption = new ControllerOption(this,modelOption);
        keyListen = new ControllerKeyboard(this,modelGame,player);

        Music.startMainMenuMusic();
        primaryStage.setTitle("BootlegTale");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void setEventHandlerMenu(ControllerMenu cm) {
        vMenu.setEvents(cm);
    }
    public void setEventHandlerGame(ControllerGame cm){
        vGame.setEventsBack(cm);
    }

    public void setEventHandlerOption(ControllerOption cm){
        vOption.setEventsBack(cm);
    }

    public void setEventKeyboard(ControllerKeyboard kl){
        vGame.setEvents(kl);
    }

    public void setGameView() {
        vGame.initView();
    }

    public void setMenuView(){
        vMenu.initView();
    }

    public void setOptionView(){
        vOption.initView();
    }

    public ViewMainMenu getvMenu() {
        return vMenu;
    }

    public ViewGame getvGame() {
        return vGame;
    }

    public ViewOption getvOption(){
        return vOption;
    }

}
